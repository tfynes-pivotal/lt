git init -b main
git add . 
git commit -m "."
gh repo create lt --public
git remote add origin https://github.com/tfynes-pivotal/lt
git branch -M main
git push -u origin main


