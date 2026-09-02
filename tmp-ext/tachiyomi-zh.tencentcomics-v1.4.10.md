# Extension Validation Report

- Extension: tachiyomi-zh.tencentcomics-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6353436350537369479
- Source name: 腾讯动漫
- Source language: zh-Hans
- Selected manga input: latest offset 0: 治疗术复制一切，我刷爆了深渊 (`.../657745`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | 一人之下 (`.../531490`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | 开局签到荒古圣体 (`.../654027`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 治疗术复制一切，我刷爆了深渊 (`.../657745`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 重生另嫁小叔，夫妻联手虐渣 (`.../657856`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 治疗术复制一切，我刷爆了深渊 (`.../657745`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 第0话 预告 (`.../143194`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhua.acimg.cn/.../420` (image/jpeg, 119692 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../657745` |  |  |  |
| details thumbnail URL | PASS | `https://manhua.acimg.cn/.../420` |  |  |  |
| details author | PASS | A·S·S无烬海 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 肆意挥洒激情的游戏人生，打破现实框架的无尽幻想！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
