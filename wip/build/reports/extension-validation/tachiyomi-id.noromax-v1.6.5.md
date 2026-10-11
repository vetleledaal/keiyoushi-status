# Extension Validation Report

- Extension: tachiyomi-id.noromax-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2636071300407720294
- Source name: Noromax
- Source language: id
- Selected manga input: popular offset 0: All Hail the Sect Leader Bahasa Indonesia (`.../all-hail-the-sect-leader-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | All Hail the Sect Leader Bahasa Indonesia (`.../all-hail-the-sect-leader-bahasa-indonesia`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Top Tier Providence: Secretly Cultivate for a Thousand Years Bahasa Indonesia (`.../top-tier-providence-secretly-cultivate-for-a-thousand-years-bahasa-indonesia`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | My Disciples Are All Big Villains Bahasa Indonesia (`.../my-disciples-are-all-big-villains-bahasa-indonesia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Absolute Dominion Bahasa Indonesia (`.../absolute-dominion-bahasa-indonesia`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | All Hail the Sect Leader Bahasa Indonesia (`.../all-hail-the-sect-leader-bahasa-indonesia`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | All Hail the Sect Leader Bahasa Indonesia (`.../all-hail-the-sect-leader-bahasa-indonesia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 573 | Chapter 01 (`.../all-hail-the-sect-leader-chapter-01-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=All Hail the Sect Leader Bahasa Indonesia, URL=`.../all-hail-the-sect-leader-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://noromax02.my.id/.../All-Hail-the-Sect-Leader_noromax-225x300.webp` (image/webp (encoding: lossy), 26136 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../all-hail-the-sect-leader-bahasa-indonesia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://noromax02.my.id/.../All-Hail-the-Sect-Leader_noromax.webp` (image/webp (encoding: lossy), 51530 bytes, 420x560) |  |  |  |
| details author | PASS | 烛道文化 \[Add, \]阅文漫画 |  |  |  |
| details artist | PASS | 烛道文化 \[Add, \]阅文漫画 |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Historical, Shounen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reinkarnasi dan dapat sistem, begitu mimpi dari MC yang satu ini. tapi nasib dari MC ini tidak begitu baik karena dia reinkarnasi kedalam tubuh seorang pemimpin sekte yang sektenya hampir hancur, dimana pemimpin sekte sebelumnya dihukum mati karena tindakan tak senonoh sehingga reputasi sekte hancur dan hanya tersisa MC seorang. bagaimanapun karena reinkarnasi ini MC tidak sabar untuk mendapatkan hadiah. namun, yang MC dapat hanyalah Tugas dengan BOM waktu dimana jika dia tidak bisa membuat sektenya menjadi no 1 didaratan bintang dalam waktu 100 tahun dia akan meledak saat batas waktu habis. dikarenakan kondisi sektenya yang seperti itu terpaksa dia berakting dan menipu semua orang, namun tidak disangka para murid yang direkrutnya memiliki bakat yang tidak biasa. ada murid yang no 1 di kota, ada murid yg dulunya kuat tapi seakrang menjadi lemah, ada juga murid yang reinkarnasi dari seorang kaisar… penasaran bagaimana kisahnya? baca komiknya dan pantengin terus untuk update terbarunya hanya di noromax.xyz…<br><br>Alternative Names: <br>- The Greatest Sect Leader of All-Time<br>- Vạn Cổ Tối Cường Tông<br>- Wangu Zui Qiang Zong<br>- Wàngǔ Zuì Qiáng Zōng<br>- Да здравствует лидер секты<br>- Лидер секты<br>- Сильнейшая секта всех времен<br>- 万古最强宗 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 573 chapters |  |  |  |
| chapter dates | PASS | 573 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../AVvXsEg9MlO0dIkcjrPS2lwWR1eAnEqHDKmWdqYWSaiL88AyzdX3J-EahcsbKPl1tlHoju1jT_mgDcQmP6YhXekOzBlWCrYLGb6RrQeFml4ofCi3Tji1LKMWMfCZchwg4cBFmmP_NMu8ZYMbxPnd3CxINyk8OLtAUCxcmPWjYt2I_PED6s02ITyku_4kQJjh` (image/jpeg, 225082 bytes, 800x1213) |  |  |  |
