cls clear
SET /P message="Enter message: "
git add .
git commit -am "%message%"
git push origin master
echo "Done! Press Enter..."
read
timeout /t -1
