# Extension Validation Report

- Extension: tachiyomi-ja.mangamee-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5152016637336953348
- Source name: MangaMee
- Source language: ja
- Selected manga input: popular offset 0: 完璧ワイフによる完璧な復讐計画 (`.../53213`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 完璧ワイフによる完璧な復讐計画 (`.../53213`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 67 | 夢不倫 (`.../54354`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 完璧ワイフによる完璧な復讐計画 (`.../53213`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 完璧ワイフによる完璧な復讐計画 (`.../53213`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 169 | 1 完璧な夫婦 (`.../203918`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 67 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=完璧ワイフによる完璧な復讐計画, URL=`53213` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://prod-img.manga-mee.jp/.../11456.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 100324 bytes, 1125x666) |  |  |  |
| details identity | PASS | Details preserved selected URL `53213` |  |  |  |
| details thumbnail URL | PASS | `https://prod-img.manga-mee.jp/.../11456.webp <redacted query values: hash and expires>` |  |  |  |
| details author | PASS | 漫画：錦ヒトミ 構成：佐倉サク 原作：雪村こはる（エブリスタ） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 不倫, スカッとする, 恋愛.../%E3%82%AA%E3%83%88%E3%83%8A |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 成美は才色兼備でありながら、仕事も家事もそつなくこなす完璧な妻だった。<br>夫のために尽くし、生涯愛する夫と幸せな家庭を築いていくと信じて疑わなかった。<br>どんなに仕事が忙しくとも、優しい夫の言葉で疲れなんて吹っ飛んでしまう。自他共に認めるおしどり夫婦。<br>そう思っていた。夫が自分の後輩と不倫をしていると知ったその時までは。<br>完璧すぎる妻による完璧な復讐物語、ここに開幕―…！<br><br>Alternative Title: かんぺきわいふによるかんぺきなふくしゅうけいかく |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 169 chapters |  |  |  |
| chapter dates | LINT | All 169 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=169 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://manga-mee.jp/.../ranking` to `https://manga-mee.jp/.../ranking <redacted query values: _rsc>` (1 redirects); popular: `https://manga-mee.jp/.../todaysupdate` to `https://manga-mee.jp/.../todaysupdate <redacted query values: _rsc>` (1 redirects); popular: `https://manga-mee.jp/.../%E5%AE%8C%E7%92%A7%E3%83%AF%E3%82%A4%E3%83%95%E3%81%AB%E3%82%88%E3%82%8B%E5%AE%8C%E7%92%A7%E3%81%AA%E5%BE%A9%E8%AE%90%E8%A8%88%E7%94%BB` to `https://manga-mee.jp/.../%E5%AE%8C%E7%92%A7%E3%83%AF%E3%82%A4%E3%83%95%E3%81%AB%E3%82%88%E3%82%8B%E5%AE%8C%E7%92%A7%E3%81%AA%E5%BE%A9%E8%AE%90%E8%A8%88%E7%94%BB <redacted query values: _rsc>` (1 redirects); popular: `https://manga-mee.jp/.../53213` to `https://manga-mee.jp/.../53213 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://prod-img.manga-mee.jp/.../15940888.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 65918 bytes, 760x1194) |  |  |  |
