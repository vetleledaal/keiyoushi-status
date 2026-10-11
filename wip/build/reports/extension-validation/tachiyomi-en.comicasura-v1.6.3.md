# Extension Validation Report

- Extension: tachiyomi-en.comicasura-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 499082788596590240
- Source name: Comic Asura
- Source language: en
- Selected manga input: popular offset 0: Wo Chusheng Dangtian, Bai Gui Yexing, Xue Shi Hu Dao (`.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Wo Chusheng Dangtian, Bai Gui Yexing, Xue Shi Hu Dao (`.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Random Hypnosis World (`.../random-hypnosis-world`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | My Girlfriend Is Long Aotian (`.../my-girlfriend-is-long-aotiann`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Sichuan's Supreme King (`.../sichuan-s-supreme-king`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Wo Chusheng Dangtian, Bai Gui Yexing, Xue Shi Hu Dao (`.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Wo Chusheng Dangtian, Bai Gui Yexing, Xue Shi Hu Dao (`.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 249 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 10s+ |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wo Chusheng Dangtian, Bai Gui Yexing, Xue Shi Hu Dao, URL=`.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img-r1.2xstorage.com/.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo.webp` (image/webp (encoding: lossy), 14990 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo` |  |  |  |
| details thumbnail URL | PASS | `https://img-r1.2xstorage.com/.../wo-chusheng-dangtian-bai-gui-yexing-xue-shi-hu-daoo.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Horror, Action, Drama, Fantasy, Adventure, Mystery |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | On a snowy night of extreme darkness, a small mountain village welcomes a female corpse who gives birth to a male baby, causing a sudden change in the moonlight and a fierce struggle among spirits. Fortunately, they are rescued by an old woman known as the "Outstanding Immortal Lady," and the boy grows up smoothly. However, it seems that there is a huge mystery hidden within the boy, and a series of eerie and terrifying events continue to unfold... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 249 chapters |  |  |  |
| chapter dates | PASS | 249 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://img-r1.2xstorage.com/.../0.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
