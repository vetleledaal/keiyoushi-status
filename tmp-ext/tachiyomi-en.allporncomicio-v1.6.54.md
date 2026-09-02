# Extension Validation Report

- Extension: tachiyomi-en.allporncomicio-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6660493687892371703
- Source name: AllPornComic.io
- Source language: en
- Selected manga input: popular offset 0: Sinful Lust All Latest chapters (`.../24219`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sinful Lust All Latest chapters (`.../24219`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Dirty Talk (`.../27241`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Mom Got Fucked Instead of Her Daughter [English] (`.../27388`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Teach Me First! ( Uncensored) (`.../27187`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sinful Lust All Latest chapters (`.../24219`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sinful Lust All Latest chapters (`.../24219`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Sinful lust Chapter 1 (`.../sinful-lust-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 89 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sinful Lust All Latest chapters, URL=`24219` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://allporncomic.io/.../00-350x476.png` (image/png, 246647 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `24219` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://allporncomic.io/.../00-193x278.png` (image/png, 87459 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | ZettoNSFW |  |  |  |
| details genres | PASS | big Ass, Big Boobs, big breast, blowjob, cheating, colored, comic, manga, married, Milf, mother, netorare, NTR, hentai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read Sinful lust Hentai Chapter 8 7 6 5 4 3,2,1 With All parts 1 2 3<br><br>Are you searching for your next favorite comic or manga series? Look no further than allporncomic.io, your ultimate destination for an incredible variety of digital comics and manga. Let’s dive into what makes our platform the perfect choice for both casual readers and devoted fans alike.<br><br>comic free download adult comic adult manga manga xxx comic xxx full English porn comic English manga Japanese porn manga download Korean porn comics online western porn comic online hot comics best porn manga<br><br>manga , allpornmanga<br><br>Ready to dive into a world of endless stories? allporncomic.io offers: * Free registration * Quick access to popular titles * Regular updates * Multiple reading formats * Cross-device synchronization<br><br>## Join Our Community Today<br><br>Whether you’re a longtime manga enthusiast or new to the world of digital comics, allpornComic welcomes you to explore our vast library of content. Start your journey today and discover why thousands of readers choose us as their go-to destination for digital comics and manga.<br><br>Join us at allporncomic.io and become part of our growing community of passionate readers. Your next favorite story is just a click away!<br><br><br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 89 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://allporncomic.io/.../1.webp` (image/webp (encoding: lossy), 148168 bytes, 2186x2880) |  |  |  |
