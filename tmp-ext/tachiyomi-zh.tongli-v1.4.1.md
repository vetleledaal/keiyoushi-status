# Extension Validation Report

- Extension: tachiyomi-zh.tongli-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5530823947742715441
- Source name: 東立
- Source language: zh
- Selected manga input: popular offset 0: 火鳳燎原 (`.../d2091f2c-6a96-e811-a947-00155d020a17,true`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 火鳳燎原 (`.../d2091f2c-6a96-e811-a947-00155d020a17,true`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 豔漢 (`.../003f132c-6a96-e811-a947-00155d020a17,true`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 魔女的使命 (`.../8834132c-6a96-e811-a947-00155d020a17,true`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | 火鳳燎原Q我的水鏡學園 (`.../45091f2c-6a96-e811-a947-00155d020a17,false`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 火鳳燎原 (`.../d2091f2c-6a96-e811-a947-00155d020a17,true`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | 第1話 (`.../ebb953d2-75e7-4f07-7c16-08d601b9d2c1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 67 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=火鳳燎原, URL=`d2091f2c-6a96-e811-a947-00155d020a17,true` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tongliebookpic.blob.core.windows.net/.../de31832d27094a98133908df0721f562.jpg` (image/jpeg, 477488 bytes, 1128x1600; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `d2091f2c-6a96-e811-a947-00155d020a17,true` |  |  |  |
| details thumbnail URL | PASS | `https://tongliebookpic.blob.core.windows.net/.../de31832d27094a98133908df0721f562.jpg` |  |  |  |
| details author | PASS | 陳某 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 無敵戰神的心專注在戰場上，再度展開他那銳不可擋的攻勢！誤墮由呂布設下死亡陷阱的曹操，在走道梟雄絕路之際，伊隻足令戰神憤怒的暗殺部隊出現！他們到底有什麼目的呢…？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tongli-ebook-cdn.azureedge.net/.../1 <redacted query values: sv, sr, st, se, sp, spr, rsct, and sig>` (image/jpeg, 1513888 bytes, 1128x1600; server Content-Type: binary) |  |  |  |
