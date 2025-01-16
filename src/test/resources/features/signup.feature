https://github.com/MagicianReborn/OpenCartProject.git
souvik.lastserver@gmail.com
2pkdAs@wZiRwjQ6

C:\Users\PREDATOR\IdeaProjects\Cucumber_TestNG_Java_BDD


first time after creating new respository in github(remote) and come to local machine and go to the project location open git bash
commands need to be executed for the first time:
git init (initiated new repository for local git)
git remote add origin "remote repository url"(to start a remote connection between local and remote)

Now whenever we need to push any code changes or new code to remote repository we need to execute the below commands (always)
git status (to check the status of the project)
git add -A or git add "filename" (adding to the staging area)
git commit -m "some comments" (to commit the changes to local git repository)


Before commit we need to execute 2 commands for the very first time only
git config --global user.name "souvik"
git config --global user.email "souvik.lastserver@gmail"


Last thing to push the changes to remote repository (git to github)
git push -u origin master


When we want to pull something from remote repository to our local (github to git)
git pull origin master
  
