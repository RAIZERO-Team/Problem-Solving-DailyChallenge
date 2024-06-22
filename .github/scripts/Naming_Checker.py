import json
import os
import re

# get the daily problem name and date
problems = {}


def read_data():
    # read the data from the file
    with open(".github/data/problems.json", "r") as file:
        data = json.load(file)

    # return the data
    return data


# check if there is a duplicate in the list of folders or files
def check_duplicate(items):
    items.sort()
    for i in range(len(items) - 1):
        if items[i] == items[i + 1]:
            print(f"There is a Duplicate with {items[i]}")
            exit(1)


def change_directory(dir=None, phase=None, week=None, daily=None):
    if daily is not None and week is not None and phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}/{week}/{daily}")
    elif week is not None and phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}/{week}")
    elif phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}")
    elif dir is not None:
        os.chdir(f"{dir}")


def check_phase_folders():
    # name of the folders in the directory
    folders = [f for f in os.listdir(".") if os.path.isdir(f)]

    # delete .github from them
    folders.remove(".github")
    folders.remove(".git")

    # check if the folders are in the directory
    for folder in folders:
        if folder not in problems:
            print(f"Phase folder {folder} name is not valid")
            exit(1)

    # if the folders are valid
    return folders


def check_week_folders(phase_folder):
    # name of the folders in the directory
    folders = [f for f in os.listdir() if os.path.isdir(f)]

    # week problems folders
    phase_data = problems[phase_folder]

    # check if the folders are in the directory
    for folder in folders:
        if folder not in phase_data:
            print(f"Week folder {folder} name is not valid")
            exit(1)

    # if the folders are valid
    return folders


def check_daily_folders(phase_folder, week_folder):
    # name of the folders in the directory
    folders = [f for f in os.listdir() if os.path.isdir(f)]

    # daily problems folders
    week_data = problems[phase_folder][week_folder]

    # check if the folders are in the directory
    for folder in folders:
        # make sure the folder is in the problems
        parts = folder.split(" ")
        parts[0] = parts[0][:-1]

        problem = {"day": parts[0], "title": " ".join(parts[1:])}

        if problem not in week_data:
            print(f"Day folder {folder} name is not valid")
            exit(1)

    # if the folders is valid
    return folders


def check_files(phase_folder):
    # name of the folders in the directory
    files = [f for f in os.listdir() if os.path.isfile(f)]

    # check if the folders are in the directory
    for file in files:
        # ignore .gitkeep file
        if file == ".gitkeep":
            continue

        user_with_ext = file.replace(phase_folder, "")
        if not re.match(
            r"\s\([A-Za-z0-9 -_]+\)\.\b(cpp|rb|py|js|ts|c|java|php|dart|cs|exs)\b",
            user_with_ext,
        ):
            print(f"File {file} name is not valid")
            exit(1)

    # check if there is a duplicate in the files
    check_duplicate(files)


def main():
    # read the global problems
    global problems

    # read the problems from the data file
    problems = read_data()

    # check folders in the repo
    phase_folders = check_phase_folders()

    # directory of the root folder
    dir = os.getcwd()

    # check folders in the phase folders
    for phase_folder in phase_folders:
        # change directory to the current phase folder
        change_directory(phase=phase_folder, dir=dir)

        # check folders in the phase folder
        week_folders = check_week_folders(phase_folder)

        for week_folder in week_folders:
            # change directory to the current week folder
            change_directory(week=week_folder, phase=phase_folder, dir=dir)

            # check folders in the week folder
            daily_folders = check_daily_folders(phase_folder, week_folder)

            for daily_folder in daily_folders:
                # change directory to the current daily folder
                change_directory(daily=daily_folder, week=week_folder, phase=phase_folder, dir=dir)

                # check files in the daily folder
                check_files(daily_folder)

                # change directory to the week folder again
                change_directory(week=week_folder, phase=phase_folder, dir=dir)

            # check if there is a duplicate in the daily folders
            check_duplicate(daily_folders)

            # change directory to the phase folder again
            change_directory(phase=phase_folder, dir=dir)

        # check if there is a duplicate in the week folders
        check_duplicate(week_folders)

        # change directory to the main folder again
        change_directory(dir=dir)

    # check if there is a duplicate in the phase folders
    check_duplicate(phase_folders)

    print("All files are valid")


if __name__ == "__main__":
    main()
