# Extension Validation Report

- Extension: tachiyomi-en.galaxymanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3084421114955435608
- Source name: Galaxy Manga
- Source language: en
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../tears-on-a-withered-flower`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Reason Why Raeliana Ended up at the Duke’s Mansion (`.../the-reason-why-raeliana-ended-up-at-the-dukes-mansion`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | My Younger Sister Chooses Me Tonight (`.../my-younger-sister-chooses-me-tonight`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | My Childhood Friends Are trying to Kill Me (`.../my-childhood-friends-are-trying-to-kill-me`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 103 | Chapter 1 (`.../tears-on-a-withered-flower-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`.../tears-on-a-withered-flower` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://galaxymanga.io/.../image-manga-687cf574e09df6.91102882-231x300.jpg` (image/jpeg, 18959 bytes, 231x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tears-on-a-withered-flower` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://galaxymanga.io/.../image-manga-687cf574e09df6.91102882.jpg` (image/jpeg, 74066 bytes, 640x831) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read manhwa Tears on a Withered Flower Na Hae-soo’s life unravels when her husband betrays her with an affair, leaving her burdened with debt and losing their child. In a devastating blow, she witnesses him with a younger woman. Broken and despondent, Na Hae-soo feels her life crumbling around her. However, a mysterious young man unexpectedly enters her life, asking to be taught about adult love. His vulnerability and sincerity begin to stir emotions within Na Hae-soo, challenging her to reconsider her path forward. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | PASS | 103 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dl.galaxymanga.io/.../image1-21231.jpg` (image/jpeg, 403725 bytes, 720x12571) |  |  |  |
