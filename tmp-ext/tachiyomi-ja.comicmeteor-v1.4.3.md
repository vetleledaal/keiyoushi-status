# Extension Validation Report

- Extension: tachiyomi-ja.comicmeteor-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
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
- Selected manga input: popular offset 0: 追放された回復師は【キャリアアップ】で無双します！～美少女3人だけで、最強パーティーを結成します～ (`.../kaifukushi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 731 | 追放された回復師は【キャリアアップ】で無双します！～美少女3人だけで、最強パーティーを結成します～ (`.../kaifukushi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 追放された回復師は【キャリアアップ】で無双します！～美少女3人だけで、最強パーティーを結成します～ (`.../kaifukushi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 追放された回復師は【キャリアアップ】で無双します！～美少女3人だけで、最強パーティーを結成します～ (`.../kaifukushi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | 第1話 (`.../viewer`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 731 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放された回復師は【キャリアアップ】で無双します！～美少女3人だけで、最強パーティーを結成します～, URL=`.../kaifukushi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 732/732 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 732/732 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kirapo.jp/.../thumbnail_34639728edad017c.avif` (image/avif (format: avif), 39685 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kaifukushi` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 漫画：氷鷹さやか, 原作：yocco |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界・ファンタジー, 可愛い, バトル・アクション |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sランクパーティーの回復師だったリリーは、ダンジョン攻略の最中に追放され、「奈落」へと落とされてしまった。「このまま独りで死ぬのかもしれない…」そう思ったとき、同じタイミングで追放された美少女2人――クールな女剣士・エルミーナと、天真爛漫キュートなパワフル少女・デイジーと出会い、 3人で前人未到の奈落ダンジョン攻略を目指すことに。 そんな中、リリーは頭を打った衝撃で、ひとつのジョブを極めると別のジョブも選べるぶっ壊れ能力【キャリアアップ】のギフトを手に入れて!? 追放された美少女3人がもう一度仲間を信じ、寄り添い合い、じゃれ合いながら、力を合わせて残酷な世界に立ち向かう、ガールズアクション×シスターフッド異世界ファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kirapo.jp/.../0001.ptimg.json` (image/jpeg, 583163 bytes, 1131x1609) |  |  |  |
