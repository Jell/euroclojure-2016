deploy:
	git checkout master
	git pull
	rm -rf docs
	lein clean
	webpack
	lein cljsbuild once min
	cp -r resources/public ./docs
	git add docs/*
	git commit -m 'Deploy'
	git push
