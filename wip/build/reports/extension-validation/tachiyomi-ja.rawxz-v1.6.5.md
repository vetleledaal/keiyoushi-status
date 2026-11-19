# Extension Validation Report

- Extension: tachiyomi-ja.rawxz-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7950551186567193810
- Source name: RawNaver
- Source language: ja
- Selected manga input: popular offset 0: 追放された転生重騎士はゲーム知識で無双する (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | 追放された転生重騎士はゲーム知識で無双する (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | ハナバス苔石花江のバスケ論 (`.../%E3%83%8F%E3%83%8A%E3%83%90%E3%82%B9%E8%8B%94%E7%9F%B3%E8%8A%B1%E6%B1%9F%E3%81%AE%E3%83%90%E3%82%B9%E3%82%B1%E8%AB%96-raw-free`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | 隣に住んでる聖女様は俺がキャラデザを担当した大人気VTuberでした (`.../%E9%9A%A3%E3%81%AB%E4%BD%8F%E3%82%93%E3%81%A7%E3%82%8B%E8%81%96%E5%A5%B3%E6%A7%98%E3%81%AF%E4%BF%BA%E3%81%8C%E3%82%AD%E3%83%A3%E3%83%A9%E3%83%87%E3%82%B6%E3%82%92%E6%8B%85%E5%BD%93%E3%81%97%E3%81%9F`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | はなまるゲーセン飯！！ (`.../%E3%81%AF%E3%81%AA%E3%81%BE%E3%82%8B%E3%82%B2%E3%83%BC%E3%82%BB%E3%83%B3%E9%A3%AF%EF%BC%81%EF%BC%81-raw-free`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 追放された転生重騎士はゲーム知識で無双する (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 追放された転生重騎士はゲーム知識で無双する (`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 186 | 第 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放された転生重騎士はゲーム知識で無双する, URL=`.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawnaver.com/.../cover-117368.jpg` (image/jpeg, 21720 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E8%BF%BD%E6%94%BE%E3%81%95%E3%82%8C%E3%81%9F%E8%BB%A2%E7%94%9F%E9%87%8D%E9%A8%8E%E5%A3%AB%E3%81%AF%E3%82%B2%E3%83%BC%E3%83%A0%E7%9F%A5%E8%AD%98%E3%81%A7%E7%84%A1%E5%8F%8C%E3%81%99%E3%82%8B-fre-raw` |  |  |  |
| details thumbnail URL | PASS | `https://rawnaver.com/.../cover-117368.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | SF・ファンタジー, バトル, 異世界・転生, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 今一番来てる「異世界転生」はこれだ！小説家になろう年間総合ランキング第１位!!(2022年1月1日計測時) 「役立たずめ……剣聖の息子でありながら、こんな大ハズレを引こうとは！」 　十五歳の〈加護の儀〉。剣聖の血筋であるエルマは、典型的なハズレクラスである重騎士を発現し、次期当主の座を奪われて追放されてしまう。重騎士は偏ったステータスに、使い所のないスキル。挙げ句に臆病で怠惰な者が得るクラスだとまでいわれていた。 　だが、エルマは知っていた。この世界は彼が遊び尽くしたゲームの世界であり――重騎士こそが、最強のクラスであることを。エルマは生前の知識をフル活用し、この世界の効率的な攻略を始めるのだった。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 186 chapters |  |  |  |
| chapter dates | PASS | 186 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://rawnaver.com/.../img-proxy.php <redacted query values: url>` at pages 44, 45, 46, 47, `https://rawxz.site/.../img-proxy.php <redacted query values: url>` at pages 48, 49 |  |  |  |
| redirects | UNUSUAL | popular: `https://rawnaver.com/.../1 <redacted query values: orderby>` to `https://rawnaver.com/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://rawnaver.com/.../1 <redacted query values: orderby>` to `https://rawnaver.com/.../manga <redacted query values: orderby>` (1 redirects) |  |  |  |
| page load | PASS | `https://rawnaver.com/.../img-proxy.php <redacted query values: url>` (image/jpeg, 56112 bytes, 220x312) |  |  |  |
