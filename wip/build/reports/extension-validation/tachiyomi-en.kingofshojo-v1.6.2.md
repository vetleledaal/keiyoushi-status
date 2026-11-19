# Extension Validation Report

- Extension: tachiyomi-en.kingofshojo-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 9153097368891994905
- Source name: King of Shojo
- Source language: en
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../tears-on-a-withered-flower`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Dark Fall (Official) (`.../dark-fall-official`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Four Choices (`.../four-choices`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Surviving as the Wife of a Serial Killer (`.../surviving-as-the-wife-of-a-serial-killer`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 130 | Chapter 1 (`.../tears-on-a-withered-flower-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`.../tears-on-a-withered-flower` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../8499cc42-cb31-4918-a6f6-bcab1f03b784.webp <redacted query values: resize>` (image/jpeg, 109709 bytes, 600x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tears-on-a-withered-flower` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../8499cc42-cb31-4918-a6f6-bcab1f03b784.webp` (image/jpeg, 108790 bytes, 640x831) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Mature, Romance, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read manhwa Tears on a Withered Flower Na Hae-soo’s life unravels when her husband betrays her with an affair, leaving her burdened with debt and losing their child. In a devastating blow, she witnesses him with a younger woman. Broken and despondent, Na Hae-soo feels her life crumbling around her. However, a mysterious young man unexpectedly enters her life, asking to be taught about adult love. His vulnerability and sincerity begin to stir emotions within Na Hae-soo, challenging her to reconsider her path forward.<br><br>Alternative Names: <br>- Unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 130 chapters |  |  |  |
| chapter dates | PASS | 130 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.ibb.co/.../1-2.jpg` (image/jpeg, 267413 bytes, 2560x1435) |  |  |  |
