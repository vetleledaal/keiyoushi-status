# Extension Validation Report

- Extension: tachiyomi-all.pornpics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 13
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
| popular_next | `fetchPopularManga(2)` | success | 19 |  (`.../stacked-amateur-priscila-displays-her-inviting-hairy-pussy-up-close-49020274`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 19 |  (`.../hot-girls-with-amazing-butts-get-on-their-knees-for-cock-and-anal-sex-67774190`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 |  (`.../hot-lola-elle-lifts-dress-in-white-stockings-to-bare-nice-tits-in-upskirt-73114764`) |  | <1s |
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
| manga title and URL | FAIL | Invalid manga: popular entry 1: title=<blank>, URL=`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`, popular entry 2: title=<blank>, URL=`.../glamorous-blonde-tommie-jo-teasing-with-her-big-tits-skinny-body-23471343`, popular entry 3: title=<blank>, URL=`.../redhead-teen-with-big-natural-tits-taking-selfies-in-her-bedroom-36815692`, popular entry 4: title=<blank>, URL=`.../young-redhead-lucy-foxx-gets-caught-masturbating-before-sex-with-her-stepdad-22824491`, popular entry 5: title=<blank>, URL=`.../russian-babe-mary-kalisy-spreads-fingers-her-trimmed-pussy-in-a-bedroom-solo-94550801`, popular entry 6: title=<blank>, URL=`.../hot-latina-model-candice-cardinele-strikes-great-nude-poses-in-white-stockings-27049157`, popular entry 7: title=<blank>, URL=`.../filthy-milf-simone-sonay-and-hot-blonde-jenna-ashley-fist-each-other-in-a-cell-73089908`, popular entry 8: title=<blank>, URL=`.../latina-amateur-displays-her-landing-strip-pussy-with-long-hair-and-bare-feet-85692795`, popular entry 9: title=<blank>, URL=`.../skinny-brunette-pearl-sage-spreads-her-incredibly-hairy-pussy-up-close-24564114`, popular entry 10: title=<blank>, URL=`.../hot-redhead-elly-clutch-removes-blue-jeans-to-pose-nude-for-penthouse-75343139`, popular entry 11: title=<blank>, URL=`.../slutty-blonde-coed-gets-her-flat-belly-glazed-with-cum-after-a-groupsex-63407847`, popular entry 12: title=<blank>, URL=`.../skinny-mature-stacey-y-doffs-her-skirt-and-rubs-her-pussy-in-a-solo-93178978`, popular entry 13: title=<blank>, URL=`.../brunette-chick-nicol-love-fluffs-up-her-meaty-pussy-lips-with-a-vacuum-pump-16031012`, popular entry 14: title=<blank>, URL=`.../colombian-teen-with-tattoos-tormenta-flaunts-her-big-ass-and-juicy-twat-31647215`, popular entry 15: title=<blank>, URL=`.../ginger-teen-amber-stark-doffs-her-skirt-and-exposes-her-boobs-in-a-solo-54758019`, popular entry 16: title=<blank>, URL=`.../glamour-babe-milla-shows-her-big-tits-her-welcoming-shaved-pussy-up-close-58576011`, popular entry 17: title=<blank>, URL=`.../very-skinny-young-lapa-spreading-her-anorexic-legs-wide-nude-on-the-table-88404476`, popular entry 18: title=<blank>, URL=`.../filthy-teen-with-small-tits-dominika-a-flaunts-her-swollen-twat-outdoors-82436378`, popular entry 19: title=<blank>, URL=`.../sexy-redhead-tia-jones-slips-off-lace-lingerie-to-reveal-ginger-hairy-pussy-75564080`, popular_next entry 1: title=<blank>, URL=`.../stacked-amateur-priscila-displays-her-inviting-hairy-pussy-up-close-49020274`, popular_next entry 2: title=<blank>, URL=`.../solo-model-with-a-sexy-ass-shows-her-tits-and-vagina-in-her-lingerie-23879180`, popular_next entry 3: title=<blank>, URL=`.../purple-haired-sex-addict-proxy-paige-exposing-her-ahole-and-trimmed-vagina-65062294`, popular_next entry 4: title=<blank>, URL=`.../amateur-nerd-meloni-moon-showing-off-her-firm-ass-and-yummy-holes-up-close-58762426`, popular_next entry 5: title=<blank>, URL=`.../reality-pornstar-sara-luvv-strips-black-dress-to-pose-naked-for-tyler-nixon-29734872`, popular_next entry 6: title=<blank>, URL=`.../beguiling-milf-with-big-tits-holly-halston-poses-topless-in-alluring-lingerie-44599639`, popular_next entry 7: title=<blank>, URL=`.../alluring-russian-teen-virginia-sun-showing-off-her-young-cuddly-body-outdoors-76722206`, popular_next entry 8: title=<blank>, URL=`.../latina-chick-kitty-jaguar-gets-a-butt-tattoo-before-being-fucked-33292267`, popular_next entry 9: title=<blank>, URL=`.../busty-milf-savannah-bond-takes-a-facial-after-sucking-and-riding-a-big-dick-90503837`, popular_next entry 10: title=<blank>, URL=`.../college-student-hazel-heart-takes-off-her-dress-before-hardcore-sex-with-her-man-75335023`, popular_next entry 11: title=<blank>, URL=`.../pretty-schoolgirl-evelyn-stone-xx-shows-her-shaved-pussy-during-a-solo-show-70939049`, popular_next entry 12: title=<blank>, URL=`.../nerdy-amateur-teen-leana-lovings-exposes-her-big-juggs-and-hot-holes-22299252`, popular_next entry 13: title=<blank>, URL=`.../naughty-arab-babe-nina-white-eats-cum-after-wild-hardcore-sex-with-a-hung-stud-93504652`, popular_next entry 14: title=<blank>, URL=`.../indian-teen-spreads-her-hairy-pussy-before-letting-her-hair-down-16936545`, popular_next entry 15: title=<blank>, URL=`.../sweet-teens-with-sexy-bodies-strip-and-toy-each-others-vagina-on-the-floor-66458878`, popular_next entry 16: title=<blank>, URL=`.../kinky-czech-teen-kitty-jane-fucking-her-sugar-daddy-in-front-of-her-boyfriend-50391108`, popular_next entry 17: title=<blank>, URL=`.../breathtaking-teen-katerina-posing-naked-on-the-bed-and-massaging-her-twat-33181984`, popular_next entry 18: title=<blank>, URL=`.../horny-amateur-babe-suri-masturbates-with-a-dolphin-toy-in-a-bathtub-65312115`, popular_next entry 19: title=<blank>, URL=`.../kasey-chase-and-her-girlfriends-throw-cash-at-male-strippers-and-fuck-them-too-26488605`, latest entry 1: title=<blank>, URL=`.../hot-girls-with-amazing-butts-get-on-their-knees-for-cock-and-anal-sex-67774190`, latest entry 2: title=<blank>, URL=`.../ebony-solo-girl-models-revealing-lingerie-during-non-nude-action-64024340`, latest entry 3: title=<blank>, URL=`.../ebony-amateur-shows-off-her-nice-boobs-in-a-few-different-sets-of-lingerie-41830393`, latest entry 4: title=<blank>, URL=`.../blonde-amateur-takes-selfies-of-her-small-tits-in-various-locations-37189298`, latest entry 5: title=<blank>, URL=`.../hot-amateur-pinches-her-nipples-and-shows-her-shaved-vagina-as-well-75733606`, latest entry 6: title=<blank>, URL=`.../a-group-of-friends-partake-in-group-sex-while-visiting-each-others-homes-46570507`, latest entry 7: title=<blank>, URL=`.../solo-girl-with-big-natural-tits-releases-her-huge-breasts-from-a-hijab-and-mask-85375781`, latest entry 8: title=<blank>, URL=`.../solo-girl-in-a-hijab-displays-her-big-tits-while-wearing-a-surgical-mask-64194545`, latest entry 9: title=<blank>, URL=`.../hot-black-teen-flashes-her-smooth-bare-feet-before-getting-totally-naked-86923149`, latest entry 10: title=<blank>, URL=`.../amateur-chick-pulls-down-her-labia-lips-to-show-her-furry-muff-14276965`, latest entry 11: title=<blank>, URL=`.../amateur-girl-exposes-her-phat-ass-before-rubbing-her-vagina-with-her-bare-feet-79336272`, latest entry 12: title=<blank>, URL=`.../older-plumper-with-short-hair-and-saggy-tits-strips-naked-in-glasses-85255540`, latest entry 13: title=<blank>, URL=`.../mature-blonde-woman-undoes-buttons-on-her-red-dress-before-showing-her-tits-73578985`, latest entry 14: title=<blank>, URL=`.../manko-starring-yuri-sato-naked-pics-14195829`, latest entry 15: title=<blank>, URL=`.../onlyfans-bbw-dalia-sex-images-57504097`, latest entry 16: title=<blank>, URL=`.../amateur-model-gets-off-the-beach-in-a-bikini-before-stripping-to-a-thong-99025654`, latest entry 17: title=<blank>, URL=`.../solo-girl-with-long-hair-models-a-variety-of-lingerie-during-solo-action-37527218`, latest entry 18: title=<blank>, URL=`.../sweet-asian-teen-with-long-hair-gets-totally-naked-on-a-patio-table-52428882`, latest entry 19: title=<blank>, URL=`.../hot-brunette-with-long-hair-models-tempting-solo-poses-for-glam-shoot-76276436`, latest_next entry 1: title=<blank>, URL=`.../hot-lola-elle-lifts-dress-in-white-stockings-to-bare-nice-tits-in-upskirt-73114764`, latest_next entry 2: title=<blank>, URL=`.../amateur-model-with-curly-blonde-hair-displays-her-big-butt-and-juicy-tits-63185347`, latest_next entry 3: title=<blank>, URL=`.../onlyfans-its-nadiia-petrakis-xxx-gallery-57960752`, latest_next entry 4: title=<blank>, URL=`.../beautiful-girl-removes-her-heels-while-modelling-non-nude-in-her-bedroom-24937234`, latest_next entry 5: title=<blank>, URL=`.../solo-girl-with-a-tan-and-a-face-mask-frees-her-big-tits-from-a-bra-57081046`, latest_next entry 6: title=<blank>, URL=`.../curvy-redhead-with-tattooed-arms-sheds-sexy-mesh-hosiery-for-a-big-cock-55372197`, latest_next entry 7: title=<blank>, URL=`.../hot-blonde-angie-faith-has-her-sexy-ass-licked-during-a-bout-of-anal-sex-16681129`, latest_next entry 8: title=<blank>, URL=`.../busty-blonde-milf-with-a-tight-vagina-gets-fucked-doggystyle-83544320`, latest_next entry 9: title=<blank>, URL=`.../deeper-kenna-james-chocolate-rod-parker-ambrose-prince-yahshua-hollywood-cas-26243839`, latest_next entry 10: title=<blank>, URL=`.../sheer-and-lace-katarina-hartlova-31336177`, latest_next entry 11: title=<blank>, URL=`.../beautiful-blonde-poses-for-solo-shoots-in-various-swimwear-and-shades-14148229`, latest_next entry 12: title=<blank>, URL=`.../older-fatty-masturbates-with-a-sex-toy-during-a-solo-performance-29624905`, latest_next entry 13: title=<blank>, URL=`.../mature-brunette-masturbates-on-her-bed-in-sexy-pantyhose-and-stockings-50965095`, latest_next entry 14: title=<blank>, URL=`.../old-woman-with-saggy-tits-fondles-her-big-boobs-before-showering-43201895`, latest_next entry 15: title=<blank>, URL=`.../busty-fatty-lady-flashing-massive-boobs-sucking-cock-in-pov-action-82340796`, latest_next entry 16: title=<blank>, URL=`.../busty-blonde-amateur-takes-off-her-hat-while-showing-her-big-boobs-92649890`, latest_next entry 17: title=<blank>, URL=`.../solo-girl-takes-selfies-while-showing-her-firm-ass-in-a-thong-and-stockings-91140003`, latest_next entry 18: title=<blank>, URL=`.../solo-girl-with-striking-beauty-and-sexy-big-tits-models-lingerie-44589003`, latest_next entry 19: title=<blank>, URL=`.../older-blonde-woman-shows-her-nipples-and-big-tits-in-black-stockings-40441824` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.pornpics.com/.../31486675_001_7815.jpg` (image/jpeg, 89106 bytes, 460x705) |  |  |  |
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
| page load | SKIP | No pages to load |  |  |  |
