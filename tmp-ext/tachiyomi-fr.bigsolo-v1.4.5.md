# Extension Validation Report

- Extension: tachiyomi-fr.bigsolo-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4410528266393104437
- Source name: BigSolo
- Source language: fr
- Selected manga input: latest offset 0: FAIRY TAIL Re:Fantasia (`.../fairy-tail-refantasia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Mushoku Tensei : Nouvelle vie, nouvelle chance (`.../mushoku-tensei-nouvelle-vie-nouvelle-chance`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 105 | FAIRY TAIL Re:Fantasia (`.../fairy-tail-refantasia`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | FAIRY TAIL Re:Fantasia (`.../fairy-tail-refantasia`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | FAIRY TAIL Re:Fantasia (`.../fairy-tail-refantasia`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Ch. 1 – Les mots ne suffisent pas (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 105 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=FAIRY TAIL Re:Fantasia, URL=`.../fairy-tail-refantasia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imgchest.com/.../2fa693f356e3.png` (image/png, 1054071 bytes, 960x1378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fairy-tail-refantasia` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imgchest.com/.../2fa693f356e3.png` |  |  |  |
| details author | PASS | Hiro Mashima |  |  |  |
| details artist | PASS | Hiro Mashima |  |  |  |
| details genres | PASS | Action, Aventure, Fantaisie |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | FAIRY TAIL Re:Fantasia est un nouveau mini-spin-off du manga FAIRY TAIL, écrit et dessiné par son créateur, Hiro Mashima. Sa prépublication débutera le 29 juillet 2026. Cette série courte et indépendante a été créée pour célébrer le 20ᵉ anniversaire de la franchise FAIRY TAIL. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../960cef3d381b.png` (image/png, 5810482 bytes, 1427x2048) |  |  |  |
