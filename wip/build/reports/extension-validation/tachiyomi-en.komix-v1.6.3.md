# Extension Validation Report

- Extension: tachiyomi-en.komix-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6862842453918709699
- Source name: Komix
- Source language: en
- Selected manga input: popular offset 0: Keep the Likes Private (`.../keep-the-likes-private`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Keep the Likes Private (`.../keep-the-likes-private`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Absolute Regression (`.../absolute-regression`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | Uroshima Monogatari (`.../uroshima-monogatari`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Breakup Progress 99% (`.../breakup-progress-99`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Keep the Likes Private (`.../keep-the-likes-private`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Keep the Likes Private (`.../keep-the-likes-private`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 0 (`.../0 <redacted query values: group>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Keep the Likes Private, URL=`keep-the-likes-private` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 243/243 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 143/243 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komix.to/.../images <redacted query values: path>` (image/jpeg, 39962 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `keep-the-likes-private` |  |  |  |
| details thumbnail URL | PASS | `https://komix.to/.../images <redacted query values: path>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Romance, Mature, Adult, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hayoon is a cosmetics influencer who shines brightly and is loved by everyone. But there’s one person in front of whom she loses that shine: another influencer, Iseo.<br><br>Even at the semester kickoff party Hayoon had been looking forward to, everyone’s attention shifts to Iseo the moment she appears.… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://komix.to/.../images <redacted query values: t>` (image/jpeg, 939588 bytes, 800x11855) |  |  |  |
