# Extension Validation Report

- Extension: tachiyomi-fr.sushiscanfr-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 23
- Lint: 1
- Warnings: 1
- Skipped: 9
- Failed: 3
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3196884165456788667
- Source name: Sushiscan.fr
- Source language: fr
- Selected manga input: latest offset 0: The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | I Became an Apartment Security Manager (`.../i-became-an-apartment-security-manager`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Ruined World Was Mistaken for a Game (`.../the-ruined-world-was-mistaken-for-a-game`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapitre 0 (`.../the-ruined-world-was-mistaken-for-a-game-chapitre-0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 504 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | SKIP | HTTP error 504 |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | HTTP error 504 |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 504 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sushiscan.fr/.../cover-3-205x300.webp` (image/webp (container: extended), 22688 bytes, 205x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-ruined-world-was-mistaken-for-a-game` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sushiscan.fr/.../cover-3.webp` (image/webp (container: extended), 262162 bytes, 1037x1517) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comédie, Drame, Fantasy, Mystère, Tragédie, Webtoon, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | « Faisons croire qu’un monde en ruines n’est qu’un jeu. » Kim Jinwoo, directeur de jeu, est un jour invoqué dans un autre monde nommé Arsilan. Après avoir lutté pendant des années pour survivre dans cet univers impitoyable, il finit par devenir un Archimage, puis atteint le rang de Transcendant. Pourtant, malgré toute sa puissance, Arsilan est au bord de la destruction…<br><br>Nom alternatif : <br>- Mistook a Ruined World for a Game<br>- Tricking Them Into Believing a Ruined World Is a Game<br>- 망한 세계를 게임으로 착각시켰다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 504 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
