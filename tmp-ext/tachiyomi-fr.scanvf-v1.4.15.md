# Extension Validation Report

- Extension: tachiyomi-fr.scanvf-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2455131357585282669
- Source name: Scan VF
- Source language: fr
- Selected manga input: latest offset 0: One Piece (`.../one_piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | One Piece (`.../one_piece`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 6 | Haikyuu (`.../haikyuu`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 5 | One Piece (`.../one_piece`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | One Piece (`.../one_piece`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece (`.../one_piece`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1196 | Chapitre 1: Romance Dawn - A l'aube d'une grande aventure (`.../chapitre-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | <1s |

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
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one_piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 32/32 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 32/32 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.scan-vf.net/.../cover_250x350.jpg` (image/jpeg, 34130 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one_piece` |  |  |  |
| details thumbnail URL | PASS | `https://www.scan-vf.net/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | Oda, Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br>Cherchant à être le roi des pirates, le jeune Monkey D. Luffy, Lorsqu'il était enfant, il a mangé "un fruit du démon" qui fait de lui un homme élastique, Luffy se déplace vers le Grand Line à la recherche de One Piece, le plus grand trésor du monde. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 139 name, chapter 140 name, chapter 141 name |  |  |  |
| chapters | PASS | 1196 chapters |  |  |  |
| chapter dates | PASS | 1196 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.scan-vf.net/.../01.webp` (image/webp (encoding: lossy), 305188 bytes, 1200x1878) |  |  |  |
