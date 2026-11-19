# Extension Validation Report

- Extension: tachiyomi-en.lgbtoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7348724258803698620
- Source name: LGBToon
- Source language: en
- Selected manga input: popular offset 0: Keep 'Likes' Private (`.../keep-likes-private`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Keep 'Likes' Private (`.../keep-likes-private`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Love Me, Revive Me (`.../love-me-revive-me`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Rockstar Never Die (`.../rockstar-never-die`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Hippegashite, Kokoro Urahara (`.../hippegashite-kokoro-urahara`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Keep 'Likes' Private (`.../keep-likes-private`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Keep 'Likes' Private (`.../keep-likes-private`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 0 (`.../6ac200a1ea38f57bb1da791a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Keep 'Likes' Private, URL=`.../keep-likes-private` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1790677824938.webp` (image/webp (encoding: lossy), 17316 bytes, 300x216) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../keep-likes-private` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1790677824938.webp` |  |  |  |
| details author | PASS | Updating |  |  |  |
| details artist | PASS | Updating |  |  |  |
| details genres | PASS | Manhwa, Drama, Romance, Yuri, Girls' Love |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Keep 'Likes' Private<br><br>**Alternative Names:**<br>- 좋아요는 비공개로<br>- keep likes private |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bulbasaur.poke-black-and-white.net/.../6ac200a1ea38f57bb1da791a-001.webp` (image/webp (encoding: lossy), 35428 bytes, 800x1500) |  |  |  |
