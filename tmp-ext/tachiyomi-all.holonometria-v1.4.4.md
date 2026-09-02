# Extension Validation Report

- Extension: tachiyomi-all.holonometria-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1334492919632049277
- Source name: HOLONOMETRIA
- Source language: en
- Selected manga input: popular offset 0: Vesta de Cooking (`.../ep0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 3 | Vesta de Cooking (`.../ep0`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Vesta de Cooking (`.../ep0`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Vesta de Cooking (`.../ep0`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | 【Chapter 0】Vesta de Cooking (`.../ep0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vesta de Cooking, URL=`.../ep0` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://holoearth.com/.../thumb_1.jpg` (image/jpeg, 261871 bytes, 1080x1527) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ep0` |  |  |  |
| details thumbnail URL | PASS | `https://holoearth.com/.../thumb_1.jpg` |  |  |  |
| details author | PASS | Johanne |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Meet Akai Haato, a girl with cooking so powerful that she isekai'd herself with a single bite. Waking up in a new world, she meets the horned shepherd Tsunomaki Watame, the popular local café's poster girl Shiranui Flare, and the knight order commander Shirogane Noel. Join these four for a heartwarming feast, with a main course of smiles and a side of chaos, as they explore the cuisine of the hololive Alternative world together, all depicted with a tender hand by manga artist Johanne! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | FAIL | Page indices are in reverse order | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://holoearth.com/.../img_1.png` (image/png, 897394 bytes, 1200x1697) |  |  |  |
