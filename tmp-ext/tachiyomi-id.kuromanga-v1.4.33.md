# Extension Validation Report

- Extension: tachiyomi-id.kuromanga-v1.4.33
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
- Source ID: 3545985978448263801
- Source name: Kuro Manga
- Source language: id
- Selected manga input: latest offset 0: Forget That Night, Your Majesty (`.../forget-that-night-your-majesty`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | A Dangerous Deal and the Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Sugar Daddy (Wolgucheon) (`.../sugar-daddy-wolgucheon`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Forget That Night, Your Majesty (`.../forget-that-night-your-majesty`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Trauma center: Trauma Surgeon (`.../trauma-center-trauma-surgeon`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Forget That Night, Your Majesty (`.../forget-that-night-your-majesty`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Forget That Night, Your Majesty (`.../forget-that-night-your-majesty`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Chapter 1 (`.../forget-that-night-your-majesty-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Forget That Night, Your Majesty, URL=`.../forget-that-night-your-majesty` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../forget-that-night-your-majesty-cover.jpg <redacted query values: resize>` (image/jpeg, 18074 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../forget-that-night-your-majesty` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../forget-that-night-your-majesty-cover.jpg` (image/jpeg, 44925 bytes, 280x420) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Josei, Romance, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lahir sebagai putri yang dibenci dari keluarga bangsawan, Lunia melarikan diri dari nasib suramnya dengan menikahi Adipati terkutuk, Hades Khronoa. Namun setelah satu malam tanpa cinta, dia menghilang tanpa jejak, tanpa sadar bahwa dia mengandung anak-anak Nick. Tujuh tahun kemudian, Hades bertekad untuk merebut kembali Lunia dan menemukannya… serta anak-anak yang tidak pernah dia tahu ada. Saat rahasia muncul kembali dan emosi menyala kembali, bisakah pasangan yang hancur ini mengurai masa lalu dan menghadapi masa depan bersama?<br><br>Alternative Names: Heika Watashi wo Wasurete Kudasai, 陛下わたしを忘れてください, Heika Watashi o Wasurete Kudasai, Ваше Величество, забудьте меня, 폐하, 저를 잊어주세요 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../00-132079.jpeg` (image/jpeg, 472828 bytes, 1080x1747) |  |  |  |
