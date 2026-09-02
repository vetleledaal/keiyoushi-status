# Extension Validation Report

- Extension: tachiyomi-vi.sinhsieusao-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4780099289691520887
- Source name: SinhSieuSao
- Source language: vi
- Selected manga input: popular offset 0: Kou iu no ga ii (`.../12`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Kou iu no ga ii (`.../12`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Album Nanami Toga (Chainsaw Man) (`.../90`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Tuần trăng mật (`.../83`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kou iu no ga ii (`.../12`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kou iu no ga ii (`.../12`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 54 | Người yêu (`.../21`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kou iu no ga ii, URL=`12` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sinhsieusao.com/.../processed-451d0fe963bb09d46209a03842cd7b83.jpg` (image/jpeg, 412271 bytes, 448x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `12` |  |  |  |
| details thumbnail URL | PASS | `https://sinhsieusao.com/.../processed-451d0fe963bb09d46209a03842cd7b83.jpg` |  |  |  |
| details author | PASS | Souryuu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Original, Souryuu, Series, Hài hước, Đời thường, Kou iu no ga ii |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cuộc sống tự do tự tại của đôi bạn trẻ không muốn có người yêu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 54 chapters |  |  |  |
| chapter dates | PASS | 54 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sinhsieusao.com/.../processed-4f31ef683a13479e8abeff8d6ec37b66.jpg` (image/jpeg, 1968061 bytes, 3000x1594) |  |  |  |
