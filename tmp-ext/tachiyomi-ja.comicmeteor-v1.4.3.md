# Extension Validation Report

- Extension: tachiyomi-ja.comicmeteor-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7760875295931980663
- Source name: Kiraboshi
- Source language: ja
- Selected manga input: popular offset 0: ダンジョンに住んでいたおっさん、最強配信者になる～職業適性『盗賊SSS』のせいで追放された俺、無双するところがやたらバズって伝説になる～ (`.../ossanhaishin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 730 | ダンジョンに住んでいたおっさん、最強配信者になる～職業適性『盗賊SSS』のせいで追放された俺、無双するところがやたらバズって伝説になる～ (`.../ossanhaishin`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ダンジョンに住んでいたおっさん、最強配信者になる～職業適性『盗賊SSS』のせいで追放された俺、無双するところがやたらバズって伝説になる～ (`.../ossanhaishin`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ダンジョンに住んでいたおっさん、最強配信者になる～職業適性『盗賊SSS』のせいで追放された俺、無双するところがやたらバズって伝説になる～ (`.../ossanhaishin`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 第1話 (`.../viewer`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 730 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ダンジョンに住んでいたおっさん、最強配信者になる～職業適性『盗賊SSS』のせいで追放された俺、無双するところがやたらバズって伝説になる～, URL=`.../ossanhaishin` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 731/731 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 731/731 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kirapo.jp/.../thumbnail_23046ed4c5c63520.avif` (image/avif (format: avif), 39049 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ossanhaishin` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 漫画：森ノどんぐり, 原作：間野ハルヒコ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界・ファンタジー, おじさん, 冒険 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 金なし、職なし、未来なしのダンジョン住みおっさんが、へっぽこ美少女冒険者パーティーをプロデュース!? ギルド長のナナシ(仮)は、王国が始めた職業適性検査で「盗賊SSS」と告げられる。そのせいで、冒険者として実績を上げてきた立場から一変、犯罪者として世間から追放されてしまう。10年後、ナナシの暮らすダンジョンへ3人の新米冒険者が迷い込み、モンスターに襲われているところを助けたら、なんと彼女たちと配信者になることに――!? 底辺おっさんを美少女たちが放っておかない!!! 最強インフルエンサーになり、人生大逆転する成り上がりストーリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kirapo.jp/.../0001.ptimg.json` (image/jpeg, 591742 bytes, 1131x1609) |  |  |  |
