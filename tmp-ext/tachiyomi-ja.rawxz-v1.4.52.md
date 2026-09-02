# Extension Validation Report

- Extension: tachiyomi-ja.rawxz-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7950551186567193810
- Source name: RawMiu
- Source language: ja
- Selected manga input: popular offset 0: 追放された転生重騎士はゲーム知識で無双する (Raw – Free) (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | 追放された転生重騎士はゲーム知識で無双する (Raw – Free) (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | とんがり帽子のアトリエ (Raw – Free) (`.../%E3%81%A8%E3%82%93%E3%81%8C%E3%82%8A%E5%B8%BD%E5%AD%90%E3%81%AE%E3%82%A2%E3%83%88%E3%83%AA%E3%82%A8-raw-free`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | カモのネギには毒がある-加茂教授の”人間”経済学講義 (Raw – Free) (`.../%E3%82%AB%E3%83%A2%E3%81%AE%E3%83%8D%E3%82%AE%E3%81%AB%E3%81%AF%E6%AF%92%E3%81%8C%E3%81%82%E3%82%8B-%E5%8A%A0%E8%8C%82%E6%95%99%E6%8E%88%E3%81%AE%E4%BA%BA%E9%96%93%E7%B5%8C%E6%B8%88%E5%AD%A6`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | 公園の姫 キャバ嬢になる (Raw – Free) (`.../%E5%85%AC%E5%9C%92%E3%81%AE%E5%A7%AB-%E3%82%AD%E3%83%A3%E3%83%90%E5%AC%A2%E3%81%AB%E3%81%AA%E3%82%8B-raw-free`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 追放された転生重騎士はゲーム知識で無双する (Raw – Free) (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | 追放された転生重騎士はゲーム知識で無双する (Raw – Free) (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 177 | 第 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放された転生重騎士はゲーム知識で無双する (Raw – Free), URL=`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawmiu.net/.../cover-117368.jpg` (image/jpeg, 21720 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw` |  |  |  |
| details thumbnail URL | PASS | `https://rawmiu.net/.../cover-117368.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | SF・ファンタジー, バトル, 異世界・転生, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 今一番来てる「異世界転生」はこれだ！小説家になろう年間総合ランキング第１位!!(2022年1月1日計測時) 「役立たずめ……剣聖の息子でありながら、こんな大ハズレを引こうとは！」 　十五歳の〈加護の儀〉。剣聖の血筋であるエルマは、典型的なハズレクラスである重騎士を発現し、次期当主の座を奪われて追放されてしまう。重騎士は偏ったステータスに、使い所のないスキル。挙げ句に臆病で怠惰な者が得るクラスだとまでいわれていた。 　だが、エルマは知っていた。この世界は彼が遊び尽くしたゲームの世界であり――重騎士こそが、最強のクラスであることを。エルマは生前の知識をフル活用し、この世界の効率的な攻略を始めるのだった。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 177 chapters |  |  |  |
| chapter dates | PASS | 177 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://rawmiu.net/.../img-proxy.php <redacted query values: url and nc>` at pages 44, 45, 46, 47, `https://rawmiu.net/.../img-proxy.php <redacted query values: url and nc>` at pages 48, 49 |  |  |  |
| page load | PASS | `https://rawmiu.net/.../img-proxy.php <redacted query values: url and nc>` (image/jpeg, 56112 bytes, 220x312) |  |  |  |
