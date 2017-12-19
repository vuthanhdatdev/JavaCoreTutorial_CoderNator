SET /P message="Enter message: "
git add -a
git commit -am "%message%"
git push origin master
echo "Done! Press Enter..."
read
timeout /t -1
