import os

# get folders in the current directory
def get_folders():
    return [f for f in os.listdir(".") if os.path.isdir(f)]

# get files in the current directory
def get_files():
    return [f for f in os.listdir(".") if os.path.isfile(f)]


# change directory to the given dir
def change_directory(dir=None, phase=None, week=None, daily=None):
    if daily is not None and week is not None and phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}/{week}/{daily}")
    elif week is not None and phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}/{week}")
    elif phase is not None and dir is not None:
        os.chdir(f"{dir}/{phase}")
    elif dir is not None:
        os.chdir(f"{dir}")


# check the author line in the given file
def check_author_line(file=None):
    if file is not None:
        # ignore .gitkeep file
        if file == ".gitkeep":
            return

        with open(file, "r") as f:
            lines = f.readlines()
            for line in lines:
                words = line.lower().split(" ")
                for word in words:
                    if "author:" in word or (
                        "author" in word and ":" in words and "author:" not in words
                    ):
                        return

    print(f"Author line is not in {file} file")
    exit(1)


def main():
    # directory of the root folder
    dir = os.getcwd()

    # name of the folders should be in the directory
    phases_folders = get_folders()

    # delete .git and .github folders
    phases_folders.remove(".git")
    phases_folders.remove(".github")

    # check folders in the phase folders
    for phase_folder in phases_folders:
        # change directory to the current phase folder
        change_directory(phase=phase_folder, dir=dir)

        weeks_folders = get_folders()

        for week_folder in weeks_folders:
            # change directory to the current week folder
            change_directory(week=week_folder, phase=phase_folder, dir=dir)

        daily_folders = get_folders()

        for daily_folder in daily_folders:
            # change directory to the current daily folder
            change_directory(daily=daily_folder, week=week_folder, phase=phase_folder, dir=dir)

            # get the files in the daily folder
            files = get_files()

            for file in files:
                # check the author line
                check_author_line(file=file)

            # change directory to the phase folder again
            change_directory(phase=phase_folder, dir=dir)

        # change directory to the main folder again
        change_directory(dir=dir)


if __name__ == "__main__":
    main()
