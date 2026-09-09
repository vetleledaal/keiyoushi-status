# Extension Validation Report

- Extension: tachiyomi-all.pornpics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 14
- Lint: 0
- Warnings: 0
- Skipped: 22
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1459635082044256286
- Source name: PornPics
- Source language: en

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 19 |  (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 19 |  (`.../horny-amateur-babe-suri-masturbates-with-a-dolphin-toy-in-a-bathtub-65312115`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 19 |  (`.../college-student-olivia-sparkle-gives-her-tutor-a-blowjob-and-handjob-combo-92985479`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 |  (`.../solo-girl-looses-her-huge-fake-tits-from-a-bra-while-wearing-a-face-mask-42371460`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | skipped | 0 |  |  | <1s |
| chapters | `fetchChapterList(manga)` | skipped | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 1: title=<blank>, URL=`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`, popular entry 2: title=<blank>, URL=`.../busty-blonde-teen-uncovers-her-big-natural-tits-in-solo-action-58348377`, popular entry 3: title=<blank>, URL=`.../sweet-teen-layla-jenner-flashes-in-public-before-having-pov-sex-51651745`, popular entry 4: title=<blank>, URL=`.../petite-babe-kelsey-kane-enjoys-a-big-dick-after-sucking-it-in-the-bathroom-88665266`, popular entry 5: title=<blank>, URL=`.../naughty-mom-lets-her-wellendowed-stepson-fuck-her-and-cum-on-her-big-tits-87568082`, popular entry 6: title=<blank>, URL=`.../filthy-milf-simone-sonay-and-hot-blonde-jenna-ashley-fist-each-other-in-a-cell-73089908`, popular entry 7: title=<blank>, URL=`.../tiny-teen-july-kisses-her-stepbrother-before-they-fuck-on-his-bed-83064600`, popular entry 8: title=<blank>, URL=`.../chubby-blonde-holly-garner-goes-topless-while-showing-her-big-tits-outdoors-52875141`, popular entry 9: title=<blank>, URL=`.../skinny-teen-zinna-shows-her-sexy-fuckable-ass-and-poses-naked-in-the-mirror-88566388`, popular entry 10: title=<blank>, URL=`.../sweet-girlfriend-gives-a-blowjob-and-gets-her-shaved-cunt-drilled-54874122`, popular entry 11: title=<blank>, URL=`.../glamour-babe-milla-shows-her-big-tits-her-welcoming-shaved-pussy-up-close-58576011`, popular entry 12: title=<blank>, URL=`.../skinny-blonde-teen-with-tiny-tits-haley-reed-strips-and-spreads-her-ass-14861562`, popular entry 13: title=<blank>, URL=`.../pretty-centerfold-tru-kait-exposes-her-big-juggs-and-round-ass-outdoors-34912104`, popular entry 14: title=<blank>, URL=`.../mexican-solo-girl-fernandinha-fernandez-releasing-big-boobs-from-lingerie-65528875`, popular entry 15: title=<blank>, URL=`.../hot-european-sluts-with-tight-booty-getting-banged-in-gym-group-sex-36855224`, popular entry 16: title=<blank>, URL=`.../naughty-arab-babe-nina-white-eats-cum-after-wild-hardcore-sex-with-a-hung-stud-93504652`, popular entry 17: title=<blank>, URL=`.../brunette-chick-nicol-love-fluffs-up-her-meaty-pussy-lips-with-a-vacuum-pump-16031012`, popular entry 18: title=<blank>, URL=`.../blonde-woman-raquel-shows-off-big-tits-and-swollen-clitoris-in-closeup-95225218`, popular entry 19: title=<blank>, URL=`.../sexy-girlfriend-ellie-smoke-displays-her-inviting-puffy-pussy-up-close-39329733`, popular_next entry 1: title=<blank>, URL=`.../horny-amateur-babe-suri-masturbates-with-a-dolphin-toy-in-a-bathtub-65312115`, popular_next entry 2: title=<blank>, URL=`.../beautiful-babe-lana-rhodes-shows-her-big-tits-and-amazing-ass-in-a-solo-67031728`, popular_next entry 3: title=<blank>, URL=`.../alt-girls-anuskatzz-and-stacy-bloom-fists-pussies-during-lesbian-sex-in-a-tub-67684105`, popular_next entry 4: title=<blank>, URL=`.../brunette-nerdy-teen-nerdy-b-teases-with-her-great-juggs-and-tasty-holes-32787624`, popular_next entry 5: title=<blank>, URL=`.../nerdy-amateur-teen-leana-lovings-exposes-her-big-juggs-and-hot-holes-22299252`, popular_next entry 6: title=<blank>, URL=`.../venezuelan-goddess-denisse-gomez-strips-unveils-her-perfect-tits-and-pussy-10585993`, popular_next entry 7: title=<blank>, URL=`.../teen-amateur-lola-sin-holds-her-spread-pussy-lips-while-showing-her-bald-pussy-38646721`, popular_next entry 8: title=<blank>, URL=`.../pornstar-teen-babe-takes-off-her-panties-for-hardcore-fucking-79578756`, popular_next entry 9: title=<blank>, URL=`.../eight-hot-girls-having-lesbian-group-sex-while-taking-a-shower-together-82624779`, popular_next entry 10: title=<blank>, URL=`.../amateur-nerd-meloni-moon-showing-off-her-firm-ass-and-yummy-holes-up-close-58762426`, popular_next entry 11: title=<blank>, URL=`.../horny-rich-chick-fucks-her-hot-wet-pussy-with-the-bed-post-70114362`, popular_next entry 12: title=<blank>, URL=`.../horny-european-babes-christen-courtney-and-alexis-brill-share-a-rod-anally-53217039`, popular_next entry 13: title=<blank>, URL=`.../adorable-teen-with-a-slim-body-faina-bona-shows-her-cunt-on-the-beach-55067677`, popular_next entry 14: title=<blank>, URL=`.../exotic-latina-sophia-leone-bares-her-big-tits-spreads-her-ass-cheeks-75635576`, popular_next entry 15: title=<blank>, URL=`.../teenage-angel-sindey-gets-her-delicious-vagina-and-butthole-stretched-out-85811292`, popular_next entry 16: title=<blank>, URL=`.../breathtaking-brunette-summer-bares-her-natural-juggs-and-trimmed-pussy-18053941`, popular_next entry 17: title=<blank>, URL=`.../brunette-latina-teen-karissa-kane-gets-a-white-dick-in-her-tight-slit-89601928`, popular_next entry 18: title=<blank>, URL=`.../breathtaking-teen-katerina-posing-naked-on-the-bed-and-massaging-her-twat-33181984`, popular_next entry 19: title=<blank>, URL=`.../redheaded-babe-arietta-adams-undresses-flaunts-her-feet-big-ass-holes-31989413`, latest entry 1: title=<blank>, URL=`.../college-student-olivia-sparkle-gives-her-tutor-a-blowjob-and-handjob-combo-92985479`, latest entry 2: title=<blank>, URL=`.../mature-fatty-releases-her-big-butt-from-bikini-bottoms-in-heels-12012699`, latest entry 3: title=<blank>, URL=`.../amateur-chick-with-long-hair-touches-her-full-bush-on-a-sofa-81156314`, latest entry 4: title=<blank>, URL=`.../amateur-bbw-shows-her-natural-tits-before-brushing-her-hairy-pussy-20838942`, latest entry 5: title=<blank>, URL=`.../cute-blonde-nicole-nichols-eats-a-meal-before-getting-totally-naked-on-a-bed-59183013`, latest entry 6: title=<blank>, URL=`.../solo-girls-of-all-shapes-and-sizes-model-lingerie-in-their-bedrooms-98590111`, latest entry 7: title=<blank>, URL=`.../busty-blonde-teen-uncovers-her-big-natural-tits-in-solo-action-58348377`, latest entry 8: title=<blank>, URL=`.../solo-girl-models-non-nude-in-sexy-lingerie-and-thigh-highs-as-well-44339261`, latest entry 9: title=<blank>, URL=`.../solo-girl-crystal-chase-unleashes-her-huge-tits-before-petting-her-bush-in-heels-52600708`, latest entry 10: title=<blank>, URL=`.../black-girl-with-a-big-ass-undresses-to-pose-in-her-underwear-65954989`, latest entry 11: title=<blank>, URL=`.../solo-girl-with-perky-tits-and-a-phat-ass-takes-selfies-in-various-outfits-38448486`, latest entry 12: title=<blank>, URL=`.../ebony-solo-girl-takes-selfies-in-a-variety-of-revealing-lingerie-outfits-88942597`, latest entry 13: title=<blank>, URL=`.../ebony-solo-girl-showcases-her-tattooed-buttocks-during-nonnude-solo-action-54429395`, latest entry 14: title=<blank>, URL=`.../amateur-solo-girl-with-a-big-booty-shows-her-boobs-and-ass-as-well-15445322`, latest entry 15: title=<blank>, URL=`.../busty-black-woman-has-sexual-intercourse-with-her-white-lover-16550288`, latest entry 16: title=<blank>, URL=`.../adorable-asian-girl-with-red-lips-poses-in-the-nude-while-sporting-glasses-36601871`, latest entry 17: title=<blank>, URL=`.../ebony-solo-girl-models-revealing-lingerie-during-non-nude-action-64024340`, latest entry 18: title=<blank>, URL=`.../black-girl-sports-a-huge-afro-while-showing-her-tattooed-butt-in-a-thong-29537308`, latest entry 19: title=<blank>, URL=`.../solo-girl-with-a-big-butt-shows-her-bare-feet-and-bald-pussy-on-a-bed-91380917`, latest_next entry 1: title=<blank>, URL=`.../solo-girl-looses-her-huge-fake-tits-from-a-bra-while-wearing-a-face-mask-42371460`, latest_next entry 2: title=<blank>, URL=`.../solo-girl-with-a-mask-over-her-mouth-sports-a-hijab-while-exposing-herself-25895024`, latest_next entry 3: title=<blank>, URL=`.../blonde-cougar-sweet-susi-hikes-in-the-public-before-flashing-her-hot-ass-96786035`, latest_next entry 4: title=<blank>, URL=`.../hot-black-teen-flashes-her-smooth-bare-feet-before-getting-totally-naked-86923149`, latest_next entry 5: title=<blank>, URL=`.../amateur-girl-exposes-her-phat-ass-before-rubbing-her-vagina-with-her-bare-feet-79336272`, latest_next entry 6: title=<blank>, URL=`.../mature-blonde-woman-undoes-buttons-on-her-red-dress-before-showing-her-tits-73578985`, latest_next entry 7: title=<blank>, URL=`.../onlyfans-bbw-dalia-sex-images-57504097`, latest_next entry 8: title=<blank>, URL=`.../solo-girl-removes-a-sheer-top-to-show-her-nice-tits-in-front-of-a-mirror-92184710`, latest_next entry 9: title=<blank>, URL=`.../beautiful-teen-chloe-moss-bathes-in-a-tub-filled-with-rose-petals-12919338`, latest_next entry 10: title=<blank>, URL=`.../curvy-redhead-with-tattooed-arms-sheds-sexy-mesh-hosiery-for-a-big-cock-55372197`, latest_next entry 11: title=<blank>, URL=`.../busty-blonde-milf-with-a-tight-vagina-gets-fucked-doggystyle-83544320`, latest_next entry 12: title=<blank>, URL=`.../older-fatty-masturbates-with-a-sex-toy-during-a-solo-performance-29624905`, latest_next entry 13: title=<blank>, URL=`.../busty-blonde-katerina-hartlova-smokes-a-vape-pen-while-playing-with-her-pussy-28510674`, latest_next entry 14: title=<blank>, URL=`.../mature-brunette-masturbates-on-her-bed-in-sexy-pantyhose-and-stockings-50965095`, latest_next entry 15: title=<blank>, URL=`.../busty-blonde-amateur-takes-off-her-hat-while-showing-her-big-boobs-92649890`, latest_next entry 16: title=<blank>, URL=`.../solo-girl-takes-selfies-while-showing-her-firm-ass-in-a-thong-and-stockings-91140003`, latest_next entry 17: title=<blank>, URL=`.../solo-girl-models-a-variety-of-clothing-and-lingerie-in-and-out-of-the-bathroom-91502464`, latest_next entry 18: title=<blank>, URL=`.../solo-girl-shows-off-her-big-booty-and-phat-ass-while-topless-50985855`, latest_next entry 19: title=<blank>, URL=`.../solo-girl-with-striking-beauty-and-sexy-big-tits-models-lingerie-44589003` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.pornpics.com/.../31486675_001_7815.jpg` (image/jpeg, 91574 bytes, 920x1371) |  |  |  |
| details identity | SKIP | No selected manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
