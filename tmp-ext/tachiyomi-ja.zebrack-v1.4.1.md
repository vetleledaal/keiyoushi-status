# Extension Validation Report

- Extension: tachiyomi-ja.zebrack-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4709947565690324919
- Source name: Zebrack
- Source language: ja
- Selected manga input: latest offset 0: 静かなるドン-もうひとつの最終章- (`.../46404`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 200 | Vジャンプ (`.../228`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | 静かなるドン-もうひとつの最終章- (`.../46404`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 静かなるドン-もうひとつの最終章- (`.../46404`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 静かなるドン-もうひとつの最終章- (`.../46404`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 167 | 🔒 (Preview) Volume - 静かなるドン―もうひとつの最終章― 集英社版 1 (`.../1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=静かなるドン-もうひとつの最終章-, URL=`46404` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 212/212 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 212/212 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asset.zebrack-comic.com/.../3119581.jpg <redacted query values: drm_key and expires>` (image/jpeg, 49643 bytes, 422x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `46404` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 新田たつお |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, アングラ・ヤンキー, アウトロー・裏社会・闇社会, 曜日連載 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 10年の時を経て、伝説の任侠コメディ、復活!!　鬼州組と盃を交わしたことで平和を手に入れた新鮮組三代目総長・近藤静也。しかし、龍宝の父が亡くなったことで、静也は新たなる抗争に巻き込まれる!?　そして、龍宝の過去と龍宝と鳴戸の出会いが遂に明かされる――！　※集英社からは電子版のみの配信となります。<br><br>Publisher/Label: 集英社 ヤングジャンプコミックスDIGITAL  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 167 chapters |  |  |  |
| chapter dates | LINT | 159 of 167 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=159 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://asset.zebrack-comic.com/.../95583607.jpg <redacted query values: drm_key and expires>` (image/jpeg, 273582 bytes, 1440x2048) |  |  |  |
