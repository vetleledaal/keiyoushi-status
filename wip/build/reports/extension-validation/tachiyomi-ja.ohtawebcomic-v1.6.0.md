# Extension Validation Report

- Extension: tachiyomi-ja.ohtawebcomic-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 3
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1056568527385317039
- Source name: Ohta Web Comic
- Source language: ja
- Selected manga input: popular offset 0: 起承転転 (`.../kishotenten`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 59 | 起承転転 (`.../kishotenten`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 起承転転 (`.../kishotenten`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 起承転転 (`.../kishotenten`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 第1話　50歳の転機 (`.../64823`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 59 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=起承転転, URL=`.../kishotenten` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webcomic.ohtabooks.com/.../kishotenten-bnr.jpg` (image/jpeg, 77520 bytes, 960x388) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kishotenten` |  |  |  |
| details thumbnail URL | PASS | `https://webcomic.ohtabooks.com/.../kishotenten-bnr.jpg` |  |  |  |
| details author | PASS | 雁須磨子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 誰かの妻にもならず、誰かの母にもならず、 娘のまま50才になった。<br>50代、中年から初老へ。身体の不調、気力・体力・記憶力の減退、若者とのジェネレーションギャップ、親の介護問題、同世代の訃報……など “老い”のあれこれを突き付けられ、“加齢”に向き合う日々。 そんな50代に足を踏み入れた主人公・葉子の身に起こる「人生の新展開」。 仕事を辞めること。東京を離れること。何かをあきらめること。 ――何者にもなれなかった私が、新しい自分と出会う物語。<br>★2025.12.10：『このマンガがすごい！2026』オンナ編 第3位にランクインしました！ これを記念して『起承転転』特設サイトも公開中です。<br>★単行本未収録話はコミックシーモアで独占配信中。第1話・最新話は引き続き無料でお読みいただけます<br>＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝ 【『起承転転』休載のお知らせ】 いつも温かい応援をありがとうございます。 この度、雁須磨子先生のご病気療養のため、しばらくの間連載をお休みさせていただくこととなりました。 今後の予定や再開時期が決まり次第、本サイトや公式X（@OhtaWebComic）よりご案内いたします。 ご理解のほど何卒よろしくお願いいたします。 ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-ap-northeast-1.amazonaws.com/.../M_H.jpg <redacted query values: dmytime>` (image/jpeg, 220899 bytes, 987x1400) |  |  |  |
