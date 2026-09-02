# Extension Validation Report

- Extension: tachiyomi-zh.dm5-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 293789630396851172
- Source name: 动漫屋
- Source language: zh
- Selected manga input: latest offset 0: 朝花夕歌 (`.../manhua-chaohuaxige`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 70 | 被追放的转生重骑士用游戏知识开无双 (`.../manhua-beizhuifangdezhuanshengchongqishiyongyouxizhishikaiwushuang`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 70 | 灰宫学姐可怕但又很可爱 (`.../manhua-huigongxuejiekepadanyouhenkeai`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 70 | 朝花夕歌 (`.../manhua-chaohuaxige`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 70 | 100年的推 (`.../manhua-100-niandetui`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 22 | 朝花夕歌 (`.../manhua-chaohuaxige`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 朝花夕歌 (`.../manhua-chaohuaxige`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 50 | 特別篇01 （32P） (`.../m1453443`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=朝花夕歌, URL=`.../manhua-chaohuaxige` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 302/302 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 302/302 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhfm2us.cdndm5.com/.../20221025163816_180x240_22.jpg` (image/jpeg, 23172 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhua-chaohuaxige` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mhfm4us.cdndm5.com/.../20221025163816_450x600_103.jpg` (image/jpeg, 106495 bytes, 450x600) |  |  |  |
| details author | PASS | 一ノ濑けい |  |  |  |
| details artist | PASS | 一ノ濑けい |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 这是少女们最为璀璨耀眼的回忆 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | All 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=50 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manhua1037zjcdn26.cdndm5.com/.../1_9734.jpg <redacted query values: cid and key>` (image/jpeg, 135289 bytes, 800x1148) |  |  |  |
