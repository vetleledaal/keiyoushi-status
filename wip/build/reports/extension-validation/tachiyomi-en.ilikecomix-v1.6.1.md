# Extension Validation Report

- Extension: tachiyomi-en.ilikecomix-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 630837345003448937
- Source name: ILikeComix
- Source language: en
- Selected manga input: popular offset 0: No Nut November (Invincible) (`.../no-nut-november-invincible`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | No Nut November (Invincible) (`.../no-nut-november-invincible`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | [AtnogH] Taming of a Star (Star vs the Forces of Evil) (`.../atnogh-taming-of-a-star-star-vs-the-forces-of-evil`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | No Nut November (Invincible) (`.../no-nut-november-invincible`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | No Nut November (Invincible) (`.../no-nut-november-invincible`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../no-nut-november-invincible`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=No Nut November (Invincible), URL=`myhentai-gallery/no-nut-november-invincible/` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ilikecomix.com/.../001-5-392x600-q72.webp` (image/webp (encoding: lossy), 117338 bytes, 1280x1022) |  |  |  |
| details identity | PASS | Details preserved selected URL `myhentai-gallery/no-nut-november-invincible/` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://ilikecomix.com/.../001-5.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Porn Comics, BBW, Big Ass, big penis, Dilf, Invincible, Milf, Muscle, Nakadashi, Superheros |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Porn Comics Pictures Book of No Nut November (Invincible).Read online images free. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ilikecomix.com/.../000-240x360.webp` (image/webp (encoding: lossy), 9030 bytes, 240x360) |  |  |  |
