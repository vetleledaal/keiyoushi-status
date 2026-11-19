# Extension Validation Report

- Extension: tachiyomi-ja.mangahotweb-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3776633555263451123
- Source name: マンガほっと
- Source language: ja
- Selected manga input: popular offset 0: ハッピーファミリー 復讐のレンタルお母さん (`.../z_R0214`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 360 | ハッピーファミリー 復讐のレンタルお母さん (`.../z_R0214`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ハッピーファミリー 復讐のレンタルお母さん (`.../z_R0214`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ハッピーファミリー 復讐のレンタルお母さん (`.../z_R0214`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | 1.第1話(1) (`.../27340`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 360 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ハッピーファミリー 復讐のレンタルお母さん, URL=`z_R0214` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 361/361 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 361/361 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://web.mangahot.jp/.../banner_medium_1736230324.9744.jpg` (image/jpeg, 49487 bytes, 480x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `z_R0214` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://web.mangahot.jp/.../banner_large_1736230324.9743.jpg` (image/jpeg, 89420 bytes, 640x426) |  |  |  |
| details author | PASS | 船木涼介 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | そんな「毒母」捨てちゃえば？<br><br>日々、わがままばかり言うこども母親に頭を悩ませる女子高生の愛理。話は通じないわ、自分の都合だけは押し付けるわ、ヒステリックな母親に辟易し、心は 死んでいくばかり。とにかく、友達や先生には会わせたくなくて、三者面談の予定を前 に愛理の気持ちは沈むばかりだった。そこで、思い出したのが友達が見つけてきた「レンタルお母さん」というサービス。最 初は胡散臭いと感じていた愛理も、背に腹は代えられず、すがるような気持ちで電話をする。そして、やってきたのは怪しくも美しい、レンタル母「アイダ」だった――。 その日から、「アイダ」による家族喰い計画が始まる。 ©船木涼介／コアミックス |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | LINT | All 82 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=82 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://web.mangahot.jp/.../content1_1687505503.4068.png` (image/jpeg, 360059 bytes, 1069x1536; server Content-Type: image/png) |  |  |  |
