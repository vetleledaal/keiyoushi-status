# Extension Validation Report

- Extension: tachiyomi-zh.komiic-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 792932060924485302
- Source name: Komiic
- Source language: zh
- Selected manga input: popular offset 0: 鬼畜英雄 (`.../1069`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 鬼畜英雄 (`.../1069`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 電鋸人 (`.../294`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 理想的小白臉生活 (`.../70`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 鞠茂兄弟的大小事 (`.../6627`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 59 | 鬼畜英雄 (`.../1069`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 鬼畜英雄 (`.../1069`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | 第 01 話 (`.../19402`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=鬼畜英雄, URL=`.../1069` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 179/179 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 179/179 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.komiic.com/.../cover.jpg` (image/jpeg, 17872 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1069` |  |  |  |
| details thumbnail URL | PASS | `https://public.komiic.com/.../cover.jpg` |  |  |  |
| details author | PASS | よのき |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 愛情, 魔幻, 魔法, 後宮, 性描寫, 血腥 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 《鬼畜英雄》講述主角高道轉生至魔界，成為透過與女性發生性行為來提升力量的傳說種族「淫魔（Incubus）」。在魔界無敵後，他為了獲得更強大的技能，前往人間界，與藥師精靈少女、SS級刺客等女性建立關係，展開充滿刺激與冒險的旅程。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | PASS | 116 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://komiic.com/.../bb248caf-b3f4-482e-81ac-e484a9473c6e` (image/jpeg, 173375 bytes, 1000x1409) |  |  |  |
