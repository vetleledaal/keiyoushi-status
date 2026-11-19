# Extension Validation Report

- Extension: tachiyomi-all.littlegarden-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4646674279369583651
- Source name: Punk Records
- Source language: fr
- Selected manga input: popular offset 0: Naruto (`.../naruto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | Naruto (`.../naruto`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | Bleach - NO BREATHES FROM HELL (`.../bleach-no-breathes-from-hell`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Naruto (`.../naruto`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Naruto (`.../naruto`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 700 | Chapitre 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Naruto, URL=`.../naruto` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://punkrecordz.com/.../thumbnail <redacted query values: v and key>` (image/webp (encoding: lossy), 35374 bytes, 400x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../naruto` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s3-preprod3.punkrecordz.com/.../Mk5gNyR4GhiGCT65X6S1b.webp` (image/webp (container: extended), 278850 bytes, 1520x2054) |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Dans le village caché de Konoha, Naruto Uzumaki est un jeune ninja turbulent et solitaire qui rêve de devenir Hokage, le chef respecté de son village. Rejeté depuis son enfance à cause du puissant démon renard scellé en lui, il devra apprendre à maîtriser ses pouvoirs, tisser des liens avec ses compagnons et affronter de redoutables adversaires pour gagner la reconnaissance de tous et accomplir son rêve. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 700 chapters |  |  |  |
| chapter dates | PASS | 700 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-preprod3.punkrecordz.com/.../0000-f4282a36-1e4b-4e79-aa1f-7c946b18fe51.webp` (image/webp (container: extended), 218724 bytes, 1419x1600) |  |  |  |
