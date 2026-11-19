# Extension Validation Report

- Extension: tachiyomi-all.cosplaytele-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7395748658970167454
- Source name: CosplayTele
- Source language: all
- Selected manga input: popular offset 0: Tiny Asa アサ (tiny.asababy) cosplay Chisa &#8211; Wuthering Waves &#8220;53 photos and 1 video&#8221; (`.../chisa-5`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tiny Asa アサ (tiny.asababy) cosplay Chisa &#8211; Wuthering Waves &#8220;53 photos and 1 video&#8221; (`.../chisa-5`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | 水淼Aqua cosplay Aglaea &#8211; Honkai:Star Rail &#8220;91 photos&#8221; (`.../aglaea-5`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Machi馬吉 – Onsen “103 photos” (`.../onsen-2`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Tokar 浵卡 (laurus0711) cosplay Lacus Clyne – The Gundam “30 photos and 1 video” (`.../lacus-clyne`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tiny Asa アサ (tiny.asababy) cosplay Chisa – Wuthering Waves “53 photos and 1 video” (`.../chisa-5`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../chisa-5`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cosplaytele.com/.../Tiny-Asa-cosplay-Chisa-Wuthering-Waves-49_result.webp` (image/webp (encoding: lossy), 262620 bytes, 2400x1600) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Tiny Asa アサ (tiny.asababy) cosplay Chisa &#8211; Wuthering Waves &#8220;53 photos and 1 video&#8221; to Tiny Asa アサ (tiny.asababy) cosplay Chisa – Wuthering Waves “53 photos and 1 video” |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Tiny Asa アサ (tiny.asababy), Chisa, Wuthering Waves, Cosplay Game, Cosplay Nude, Tiny Asa アサ (tiny.asababy), Video Cosplay, Chisa, Wuthering Waves |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tiny Asa アサ (tiny.asababy) cosplay Chisa – Wuthering Waves “53 photos and 1 video” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://cosplaytele.com/.../1` to `https://cosplaytele.com` (1 redirects) |  |  |  |
| page load | PASS | `https://cosplaytele.com/.../Tiny-Asa-cosplay-Chisa-Wuthering-Waves-1_result.webp` (image/webp (encoding: lossy), 85312 bytes, 1067x1600) |  |  |  |
