# Extension Validation Report

- Extension: tachiyomi-fr.scanvf-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmrcms
- Source ID: 2455131357585282669
- Source name: Scan VF
- Source language: fr
- Selected manga input: popular offset 0: One Piece (`.../one_piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | One Piece (`.../one_piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 6 | Haikyuu (`.../haikyuu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | One Piece (`.../one_piece`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 5 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece (`.../one_piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one_piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1204 | Chapitre 1: Romance Dawn - A l'aube d'une grande aventure (`.../chapitre-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one_piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=One Piece, URL=`.../one_piece` at page 1 offset 0 and page 2 offset 1, title=One Punch Man, URL=`.../one-punch-man` at page 1 offset 1 and page 2 offset 0, title=Kingdom, URL=`.../kingdom` at page 1 offset 2 and page 2 offset 2, title=Boruto, URL=`.../boruto` at page 1 offset 3 and page 2 offset 3 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.scan-vf.net/.../cover_250x350.jpg` (image/jpeg, 34130 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one_piece` |  |  |  |
| details thumbnail URL | PASS | `https://www.scan-vf.net/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | Oda, Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br>Cherchant à être le roi des pirates, le jeune Monkey D. Luffy, Lorsqu'il était enfant, il a mangé "un fruit du démon" qui fait de lui un homme élastique, Luffy se déplace vers le Grand Line à la recherche de One Piece, le plus grand trésor du monde. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 147 name, chapter 148 name, chapter 149 name |  |  |  |
| chapters | PASS | 1204 chapters |  |  |  |
| chapter dates | PASS | 1204 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.scan-vf.net/.../01.webp` (image/webp (encoding: lossy), 305188 bytes, 1200x1878) |  |  |  |
