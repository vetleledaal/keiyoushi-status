# Extension Validation Report

- Extension: tachiyomi-it.zeurelscan-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8830049663587145084
- Source name: ZeurelScan
- Source language: it
- Selected manga input: popular offset 0: Administrator - Kang Jin Lee (`.../administrator-kang-jin-lee`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Administrator - Kang Jin Lee (`.../administrator-kang-jin-lee`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 6 | Primal Hunter (`.../A003`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Administrator - Kang Jin Lee (`.../administrator-kang-jin-lee`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Administrator - Kang Jin Lee (`.../administrator-kang-jin-lee`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 139 | Capitolo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Administrator - Kang Jin Lee, URL=`.../administrator-kang-jin-lee` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.zeurelscan.com/.../Kang.jpg` (image/jpeg, 233806 bytes, 1215x1400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../administrator-kang-jin-lee` |  |  |  |
| details thumbnail URL | PASS | `https://www.zeurelscan.com/.../Kang.jpg` |  |  |  |
| details author | PASS | Roh Kyung-chan |  |  |  |
| details artist | PASS | Song Yun-dal |  |  |  |
| details genres | PASS | Arti Marziali |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Amministratore Kang Jin Lee E' pazzo? O è semplicemente in cerca di attenzioni? Kang Jin Lee, non riesce a comprendere le differenze tra le persone ed il suo Maestro Kwak No sta tentando di aiutarlo a superare questo problema. Questa è la storia di uno studente e del suo Maestro ambientata nel mondo del famoso Manhwa "Peerless Dad". |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 139 chapters |  |  |  |
| chapter dates | PASS | 139 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://zeurelscan.com/.../Admin_start.jpg` (image/jpeg, 445597 bytes, 800x1800) |  |  |  |
