* Quick overview of the stack

** Figwheel
** re-frame

* Deploy?

Compile locally, then S3 behind CloudFront for SSL

* Designers?

** People that only want to deal with HTML + CSS/SASS
Relatively easy: re-frame + kioo, then design templates directly in
HTML.

** People that want to write React components (but not that weird parenthesis thing)
Work in progress, webpack as pre-build step.

* How to build non-cljs stuff

Lein, then boot, then lein + grunt, then gulp + lein. Future: gulp +
webpack + lein?

* cache-busting

* Honeybadger

Not as many errors as one could think, but some random crap sometimes.
Source mapping support is nice.

* time-traveling debugger

Honeybadger is nice, but what if we could replay a scenario up until
failure?

* REPL-driven tests

https://gist.github.com/Jell/76abeb78e8c472119079b951b1c2e9f5

* The internet is broken
** broken iOS JIT compilers (safari iphone 4)
patch with imul.js
** :static-fn true
for safari browsers
