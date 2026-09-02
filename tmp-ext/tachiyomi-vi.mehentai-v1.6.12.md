# Extension Validation Report

- Extension: tachiyomi-vi.mehentai-v1.6.12
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
- Source ID: 1503074002208879050
- Source name: MeHentai
- Source language: vi
- Selected manga input: popular offset 0: Mỹ vị nhân gian (`.../my-vi-nhan-gian`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Mỹ vị nhân gian (`.../my-vi-nhan-gian`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Mỹ vị nhân gian (`.../my-vi-nhan-gian`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Nàng tiên cá tôi yêu (`.../nang-tien-ca-toi-yeu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mỹ vị nhân gian (`.../my-vi-nhan-gian`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mỹ vị nhân gian (`.../my-vi-nhan-gian`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Chapter 24 (`.../chuong-24`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mỹ vị nhân gian, URL=`.../my-vi-nhan-gian` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` (image/webp (encoding: lossy), 51848 bytes, 648x1101) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-vi-nhan-gian` |  |  |  |
| details thumbnail URL | PASS | `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` |  |  |  |
| details author | PASS | STOL Manga |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://truyen-api.360api.tech/.../content <redacted query values: expires, signature, and proxy>` (image/webp (encoding: lossy), 305070 bytes, 729x8892) |  |  |  |
