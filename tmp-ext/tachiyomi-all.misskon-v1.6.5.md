# Extension Validation Report

- Extension: tachiyomi-all.misskon-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 492049561920540214
- Source name: MissKon
- Source language: all
- Selected manga input: popular offset 0: [Herovia] Choi Somi (최솜이): Some Cat (91 photos) (`.../117128-herovia-choi-somi-choesom-i-cat-91-photos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | [Herovia] Choi Somi (최솜이): Some Cat (91 photos) (`.../117128-herovia-choi-somi-choesom-i-cat-91-photos`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | DJAWA Photo: YuRa – Nikke Noir Black Rabbit (102 photos) (`.../117465-djawa-photo-yura-nikke-noir-black-rabbit-102-photos`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Coser@nookkizzcos: Aglaea (19 photos) (`.../117407-coser-nookkizzcos-aglaea-19-photos`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Herovia] Choi Somi (최솜이): Some Cat (91 photos) (`.../117128-herovia-choi-somi-choesom-i-cat-91-photos`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Herovia] Choi Somi (최솜이): Some Cat (91 photos) (`.../117128-herovia-choi-somi-choesom-i-cat-91-photos`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Herovia\] Choi Somi (최솜이): Some Cat (91 photos), URL=`.../117128-herovia-choi-somi-choesom-i-cat-91-photos` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 56/56 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 56/56 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://misskon.com/.../Herovia-Choi-Somi-Som-i-Some-Cat-MissKON.com-000.webp` (image/webp (container: extended), 24368 bytes, 600x315) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../117128-herovia-choi-somi-choesom-i-cat-91-photos` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Choi Somi, Herovia |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://misskon.com/.../1` to `https://misskon.com` (1 redirects); popular: `https://misskon.com/.../1` to `https://misskon.com/.../117128-herovia-choi-somi-choesom-i-cat-91-photos` (2 redirects); popular: `https://misskon.com/.../2` to `https://misskon.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://tez.misskon.com/.../Herovia-Choi-Somi-Som-i-Some-Cat-MissKON.com-003.UDCOF8Hb.webp` (image/webp (encoding: lossy), 65262 bytes, 1024x1536) |  |  |  |
