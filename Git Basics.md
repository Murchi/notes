## GIT BASICS

### Git Workflow
 There are three main components of a Git project:
* Repository
* Working Tree<img width="768" alt="Screenshot 2021-06-19 at 12 44 05 AM" src="https://user-images.githubusercontent.com/9089916/122607177-cf361800-d097-11eb-817b-8b9f183012af.png">

* Index


  * The **repository**, or repo, is the **“container”** that tracks the changes to your project files. It holds all of the commits — a snapshot of all your files at a point in time — that have been made. You can access the commit history with the Git log.
  * The **working tree,** or working directory, consists of files that you are currently working on. You can think of a working tree as a file system where you can view and modify files.
  * The **index, or staging area**, is where commits are prepared. The index compares the files in the working tree to the files in the repo. When you make a change in the working tree, the index marks the file as modified before it is committed.
  
  
 ## Three Stages of GIT
 
 * Modified
 * Staged
 * Committed
   * When we modify a file changes can be found in the working tree
   * Stage the changes if we want to include the same into the next commit
   * Once staging is done, commit all the files and add a message describing what you changed. The modified files will then be safely stored in the repo.
   <img width="783" alt="Screenshot 2021-06-19 at 12 52 45 AM" src="https://user-images.githubusercontent.com/9089916/122607773-b712c880-d098-11eb-9af2-d48b122bf214.png">
   
  ## Creating a Repository
  
  * **Remote repositories and local repositories**

    * Remote Repository is hosted on a remote, or off-site, server that is shared among multiple team members.
    * A local repository is hosted on a local machine for an individual user.
    <img width="626" alt="Screenshot 2021-06-19 at 1 00 53 AM" src="https://user-images.githubusercontent.com/9089916/122608448-d8c07f80-d099-11eb-989b-7a28edeb358a.png">
    
    
    ### Git init
      *  create a new repo from scratch using the git init command. It can be used to introduce Git into an existing, unversioned project so that you can start tracking changes.
    ### Git clone
      * copy a remote repository onto your local machine using the git clone command. By default, git clone will automatically set up a local master branch that tracks the remote master branch it was cloned from.
      
  ## Recording Changes
  
  * The working tree is where you make changes.
  * Once a file has been changed in the working tree, it is noted as modified in the index (e.g., the staging area where new commits are prepared) where it sits between the repository and the working tree.
  * Changes made in the working tree are not saved directly to the repository. All changes are first staged in the index and then saved in the repo. Only the files in the index are committed to the repo.
    ### Git Commit
      * lets you record file changes in the repository's Git history.
      <img width="649" alt="Screenshot 2021-06-19 at 1 28 42 AM" src="https://user-images.githubusercontent.com/9089916/122610749-c7797200-d09d-11eb-8721-598ceb805b23.png">
      
      * A 40-character checksum hash uniquely identifies each commit.
      *  We can use the checksum hash to retrieve the status or changes that were made on the given commit in your repository.
  ## Undoing Changes
  
  * Git revert
    * Use the git revert command to safely undo a commit that has already been pushed.
     <img width="421" alt="Screenshot 2021-06-19 at 1 41 34 AM" src="https://user-images.githubusercontent.com/9089916/122611764-7e2a2200-d09f-11eb-89dc-a96b925d15cc.png">

* Git reset
    * Discard commits that you no longer need using the git reset command. You can specify the scope for the reset command by going into reset mode.
    <img width="569" alt="Screenshot 2021-06-19 at 1 43 52 AM" src="https://user-images.githubusercontent.com/9089916/122611914-cf3a1600-d09f-11eb-956f-0c2d5c3cb4a0.png">
    
    * 


