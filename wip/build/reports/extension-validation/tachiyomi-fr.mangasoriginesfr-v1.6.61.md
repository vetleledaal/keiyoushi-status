# Extension Validation Report

- Extension: tachiyomi-fr.mangasoriginesfr-v1.6.61
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: origines
- Source ID: 4803238581797687746
- Source name: Mangas-Origines.fr
- Source language: fr
- Selected manga input: popular offset 0: Solo Leveling (`.../826-solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Solo Leveling (`.../826-solo-leveling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Second Life Ranker (`.../second-life-ranker`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | The Return of the Unrivaled Genius Ranker (`.../the-return-of-the-unrivaled-genius-ranker`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Infinite Apostles and Twelve War Girls (`.../infinite-apostles-and-twelve-war-girls`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | Myst Might Mayhem (`.../myst-might-mayhem`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../826-solo-leveling`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 203 | Chapitre 0 Ch.0 (`.../chapitre-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 11: title=Solo Leveling, URL=`826-solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangas-origines.fr/.../solo-leveling-vol-3-comic-209x300.jpg` (image/jpeg, 82601 bytes, 714x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `826-solo-leveling` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mangas-origines.fr/.../solo-leveling-vol-3-comic-714x1024.jpg` was not downloaded |  |  |  |
| details author | PASS | Chugong |  |  |  |
| details artist | PASS | DUBU |  |  |  |
| details genres | PASS | Action, Aventure, Combat, Comédie, Drame, Ecchi, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Depuis qu’un portail connectant notre monde à un monde peuplé de monstres et de créatures en tout genre est apparu, des personnes « ordinaires » ont acquis la capacité de chasser ces derniers. On les appelle les chasseurs. Vous pensez qu’ils sont tous balaises ? Qu’ils sont des héros, des aventuriers comme on en voit dans les mangas ? Eh bien malheureusement pas tous. Sung Jin-Woo est le plus faible des chasseurs de rang E, autrement dit, le plus faible parmi les faibles. Il est donc surnommé par ses confrères chasseurs « le faible ». En-tout-cas, il l’était, jusqu’à ce qu’il se retrouve piégé dans un donjon et y acquière une capacité… étrange. Il peut désormais voir une interface lui montrant des quêtes. Va-t-il réussir à devenir le plus puissant des chasseurs ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | PASS | 203 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangas-origines.fr/.../1.jpg` (image/jpeg, 1432713 bytes, 720x5000) |  |  |  |
