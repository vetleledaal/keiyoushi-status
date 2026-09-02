# Extension Validation Report

- Extension: tachiyomi-fr.pantheonscan-v1.6.55
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
- Source ID: 1615599506055429686
- Source name: Pantheon Scan
- Source language: fr
- Selected manga input: popular offset 0: Solo Leveling (`.../1894`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Solo Leveling (`.../1894`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | Otherworldly Sword King’s Survival Records (`.../2188`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | Amaama Cinderella (`.../3289`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Global martial arts (`.../2509`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Solo Leveling (`.../1894`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../1894`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 203 | Chapitre 195 (`.../chapitre-195`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`1894` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pantheon-scan.com/.../image-149x238.gif` (image/gif (format: 89a), 20637 bytes, 149x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1894` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pantheon-scan.com/.../image.gif` (image/gif (format: 89a), 422236 bytes, 149x278) |  |  |  |
| details author | PASS | Gee So-Lyung, Jang Sung-Lak |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Aventure, Combat, Drame, Fantaisie, Fantastique, Guerre, Manhwa, Surnaturel, Webtoon, D&C Media, Kakao, Scantrad France, Verytoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Depuis qu’un portail connectant notre monde à un monde peuplé de monstres et de créatures en tout genre est apparu, des personnes “ordinaires” ont acquis la capacité de chasser ces derniers. On les appelle les chasseurs. Vous pensez qu’ils sont tous balaises ? Qu’ils sont des héros, des aventuriers comme on en voit dans les mangas ? Eh bien malheureusement pas tous. Sung Jin-Woo est le plus faible des chasseurs de rang E, autrement dit, le plus faible parmi les faibles. Il est donc surnommé par ses confrères chasseurs “le faible”. En tout cas il l’était, jusqu’à ce qu’il se retrouve piégé dans un donjon et y acquière une capacité… étrange. Il peut désormais voir une interface lui montrant des quêtes. Va-t-il réussir à devenir le plus puissant des chasseurs ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | PASS | 203 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://pantheon-scan.com/.../1.jpg` (image/jpeg, 119803 bytes, 735x1219) |  |  |  |
