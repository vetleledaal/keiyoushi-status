# Extension Validation Report

- Extension: tachiyomi-fr.kiwiyascans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8654267899929745421
- Source name: Kiwiya Scans
- Source language: fr
- Selected manga input: popular offset 0: After the School Belle Dumped Me, I Became a Martial Arts God (`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | After the School Belle Dumped Me, I Became a Martial Arts God (`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Alone as a Slime (`.../alone-as-a-slime`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Really Don’t Want to Learn Forbidden Spells (`.../i-really-dont-want-to-learn-forbidden-spells`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Je suis devenu le plus jeune fils d’un roman romantique (`.../je-suis-devenu-le-plus-jeune-fils-dun-roman-romantique`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | After the School Belle Dumped Me, I Became a Martial Arts God (`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | After the School Belle Dumped Me, I Became a Martial Arts God (`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 109 | Chapitre 1 (`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=After the School Belle Dumped Me, I Became a Martial Arts God, URL=`.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../aOB6n2.webp` (image/png, 1185855 bytes, 810x1074) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../after-the-school-belle-dumped-me-i-became-a-martial-arts-god` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../aOB6n2.webp` |  |  |  |
| details author | PASS | Wenyuan Culture (闻源文化) |  |  |  |
| details artist | PASS | Wenyuan Culture (闻源文化) |  |  |  |
| details genres | PASS | ⚔️ action, 📱 moderne, 🔞 ecchi, 🗺️ aventure, 🧚‍♂️ fantastique, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fang Yi, réincarné dans ce monde, vient tout juste de se faire larguer par sa magnifique petite amie du lycée. Au départ, il pensait vivre une romance moderne classique… Mais voilà que le système l’alerte : dans un an, une résurgence de l’énergie spirituelle va bouleverser le monde — jusqu’à plonger l’humanité dans l’apocalypse. « Avec un système à mes côtés, de quoi devrais-je avoir peur ? »<br><br>Alternative Names: Après que la reine du lycée m’a largué, je suis devenu un dieu des arts martiaux, 被校花分手后,我直接武道通神 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | LINT | All 109 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=109 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kiwiyascans.com/.../01-4.jpg` (image/jpeg, 5335545 bytes, 800x10594) |  |  |  |
