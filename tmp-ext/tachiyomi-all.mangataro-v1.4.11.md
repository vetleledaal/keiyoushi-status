# Extension Validation Report

- Extension: tachiyomi-all.mangataro-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 1
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8358097306709528603
- Source name: MangaTaro
- Source language: en
- Selected manga input: latest offset 0: TRUMP (`.../%7B%22id%22:%22701143%22,%22slug%22:%22trump%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | One Piece (`.../%7B%22id%22:%2247%22,%22slug%22:%22one-piece%22%7D`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Magic Academy's Genius Blinker (`.../%7B%22id%22:%223562%22,%22slug%22:%22magic-academys-genius-blinker%22%7D`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | TRUMP (`.../%7B%22id%22:%22701143%22,%22slug%22:%22trump%22%7D`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 23 | My Contract Marriage and Life With the Adorable Twins End Today... Or So I Thought (`.../%7B%22id%22:%22689353%22,%22slug%22:%22my-contract-marriage-and-life-with-the-adorable-twins-end-today-or-so-i-thought%22%7D`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | TRUMP (`.../%7B%22id%22:%22701143%22,%22slug%22:%22trump%22%7D`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | TRUMP (`.../%7B%22id%22:%22701143%22,%22slug%22:%22trump%22%7D`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=TRUMP, URL=`{"id":"701143","slug":"trump"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangataro.org/.../manga-701143-cover-1787952386.jpg` (image/jpeg, 395021 bytes, 1057x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":"701143","slug":"trump"}` |  |  |  |
| details thumbnail URL | PASS | `https://mangataro.org/.../manga-701143-cover-1787952386.jpg` |  |  |  |
| details author | PASS | Hamaguri, Suemitsu Kenichi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adaptation, Fantasy, Supernatural, Vampires, manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sophie, a boy with vampire and human blood, is transferred from an orphanage to an institution called Clan. The school houses vampire boys who have reached their Cocoon period, or puberty in human terms. Sophie has a fateful encounter with a boy named Ul while being coldly greeted by the vampires around him. As Ul continues to research the “power of immortality” that vampires once possessed, he learns of the existence of TRUMP, the original vampire that is said to live forever, and begins to crave eternal life.<br>Eventually, Sophie and Ul become entangled in the deep fate surrounding the legend of immortality…<br>A manga adaptation of the origin story of playwright Kenichi Suemitsu’s popular series! A Gothic school fantasy that beautifully spins the conflicts of impressionable and sensitive boysー!<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
