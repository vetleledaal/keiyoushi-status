# Extension Validation Report

- Extension: tachiyomi-all.mitaku-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7541045796029140694
- Source name: Mitaku
- Source language: all
- Selected manga input: popular offset 0: Umeko J – Mai Shiranui Set 2 (`.../umeko-j-mai-shiranui-set-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Umeko J – Mai Shiranui Set 2 (`.../umeko-j-mai-shiranui-set-2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 9 | Lowkey Dead Inside – Malfoid (Video) (`.../lowkey-dead-inside-malfoid`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Umeko J – Mai Shiranui Set 2 (`.../umeko-j-mai-shiranui-set-2`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Umeko J – Mai Shiranui Set 2 (`.../umeko-j-mai-shiranui-set-2`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../umeko-j-mai-shiranui-set-2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 84 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Umeko J – Mai Shiranui Set 2, URL=`.../umeko-j-mai-shiranui-set-2` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Umeko-J-Mai-Shiranui-Set-2-Cover.jpg` (image/jpeg, 263871 bytes, 800x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../umeko-j-mai-shiranui-set-2` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ero Cosplay, Online Video, Mai Shiranui, The King of Fighters, Umeko J |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 84 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mitaku.net/.../1` to `https://mitaku.net/.../ero-cosplay` (1 redirects); popular: `https://mitaku.net/.../2` to `https://mitaku.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://mitaku.net/.../Umeko-J-Mai-Shiranui-Set-2-1.jpg` (image/jpeg, 363158 bytes, 1024x1024) |  |  |  |
