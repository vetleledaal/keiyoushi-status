# Extension Validation Report

- Extension: tachiyomi-ja.mangaparkpublisher-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2905661176145448719
- Source name: Manga-Park
- Source language: ja
- Selected manga input: popular offset 0: 「赤毛の役立たず」とクビになった魔力なしの魔女ですが、「薬草の知識がハンパない！」と王立研究所に即採用されました。 (`.../64117`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 「赤毛の役立たず」とクビになった魔力なしの魔女ですが、「薬草の知識がハンパない！」と王立研究所に即採用されました。 (`.../64117`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 79 | 婚約者がヤンデレになる前に私がヤンデレになれば生存率爆上がり説 (`.../97552`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 「赤毛の役立たず」とクビになった魔力なしの魔女ですが、「薬草の知識がハンパない！」と王立研究所に即採用されました。 (`.../64117`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 「赤毛の役立たず」とクビになった魔力なしの魔女ですが、「薬草の知識がハンパない！」と王立研究所に即採用されました。 (`.../64117`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 169 | 🆓 第1話①「今日でお前はクビだ」 (`.../558418`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 79 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=「赤毛の役立たず」とクビになった魔力なしの魔女ですが、「薬草の知識がハンパない！」と王立研究所に即採用されました。, URL=`.../64117` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-park.com/.../2\$kr6Vwgw.jpg <redacted query values: tc64ga--Y-IltzoCGGb7ozaF3tdJGFduoVr6tbTNqqQ>` (image/jpeg, 60128 bytes, 540x540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../64117` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-park.com/.../1\$2q2Vwgw.jpg <redacted query values: PN6DGmIZ6grcA8rTxkBMGPoJZutDNij0c6MHtc7Q-AI>` (image/jpeg, 64914 bytes, 750x450) |  |  |  |
| details author | PASS | 漫画／天宮こなつ　原作／糸加 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女子向け, ファンタジー, Parkオリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「ルジェナ・レジェク。今日でお前はクビだ！」「みんな気を遣ってたんですよ。魔力がない魔女なのに、調剤まで下手くそなんて」 薬草工房長の代替わりにより、仕事と住む場所を突然失ったルジェナ。しかし、偶然知り合った貴族のエーリクは前のめりに提案する。 「ルジェナ、君の薬草の知識、すごいよ！私の作った王立研究所で働いてくれないか？」 それまで自分の知識を褒められたことなどないルジェナは、信じられない思いでそれを承諾する。しかし、エーリクの提案はそれだけではなかった。なんと、偽の婚約者になってほしいと言ってきて――！？ 一方、ルジェナが去った後の工房は、作る薬の質が下がったと苦情が殺到。ルジェナを追い出した者たちは、彼女の居場所を探そうとするが……。 魔力のない魔女ルジェナを、（少々変わり者の）貴族エーリクが溺愛する身分差ラブストーリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 169 chapters |  |  |  |
| chapter dates | LINT | 2 of 169 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-park.com/.../2h\$5L7iuQw.jpg.enc <redacted query values: 5JbcrA3sy_DU5aC93TEBgJDX1dylJwBsaGsgAXTvwRwfGTfq-9lEu9Pdgeyi6fqCQRP17J40>` (image/jpeg, 161508 bytes, 960x1378; server Content-Type: application/octet-stream) |  |  |  |
