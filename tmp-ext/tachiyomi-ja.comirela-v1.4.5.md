# Extension Validation Report

- Extension: tachiyomi-ja.comirela-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 58641447023846824
- Source name: Comirela
- Source language: ja
- Selected manga input: popular offset 0: ねこねこ幼女の愛情ごはん～異世界でもふもふ達に料理を作ります！～ (`.../12da78d1e28ee`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | ねこねこ幼女の愛情ごはん～異世界でもふもふ達に料理を作ります！～ (`.../12da78d1e28ee`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 引きこもり令嬢は皇妃になんてなりたくない！～強面皇帝の溺愛が駄々漏れで困ります～ (`.../3f74b9e877c09`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ねこねこ幼女の愛情ごはん～異世界でもふもふ達に料理を作ります！～ (`.../12da78d1e28ee`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ねこねこ幼女の愛情ごはん～異世界でもふもふ達に料理を作ります！～ (`.../12da78d1e28ee`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 39 | 1 (`.../384f18f9f5bc6`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ねこねこ幼女の愛情ごはん～異世界でもふもふ達に料理を作ります！～, URL=`.../12da78d1e28ee` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202606291112252066B54D81E69726F17773A8A8BBF40E45F-lg.webp` (image/webp (encoding: lossy), 66846 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12da78d1e28ee` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202606291112252066B54D81E69726F17773A8A8BBF40E45F.png` (image/png, 5501166 bytes, 2560x1344) |  |  |  |
| details author | PASS | 園太デイ, 葉月クロル, Shabon |  |  |  |
| details artist | PASS | 園太デイ, 葉月クロル, Shabon |  |  |  |
| details genres | PASS | Berry's Fantasy, 女性マンガ, ファンタジー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【もふるって幸せ☆過保護な狼とのもふり・もふられスローライフを大満喫！】<br> もふもふに囲まれる事を夢見て修行中の新人トリマー・エリナ。生活苦で居酒屋のバイトを掛け持ちしつつ奮闘するも、帰宅途中で車にひかれてしまう。人生詰んだ…と絶望するのだが、目が覚めると予想外の光景が広がっていて――<br> 「うわあ、ふわふわのもふもふだー！」<br> 大好きなもふもふだらけの世界に転移!! しかも自分も猫耳幼女になっていて、狼に保護されて甘やかされ放題!? 前世のお料理知識も活かして、この優しい世界を満喫しちゃいます！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comirela.com/.../master-1781141739427-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 1, 11, 15, 14, 10, 7, 8, 3, 2, 5, 12, 4, 6, 13, 0\]` (image/jpeg, 481092 bytes, 1055x1500) |  |  |  |
