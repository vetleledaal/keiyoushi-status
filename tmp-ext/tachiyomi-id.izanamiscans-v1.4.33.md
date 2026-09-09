# Extension Validation Report

- Extension: tachiyomi-id.izanamiscans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 831567442922111170
- Source name: Izanami Scans
- Source language: id
- Selected manga input: latest offset 0: Ming Dynasty’s Failure (`.../ming-dynastys-failure`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 20 | Ming Dynasty’s Failure (`.../ming-dynastys-failure`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Absolute Regression (`.../absolute-regression`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ming Dynasty’s Failure (`.../ming-dynastys-failure`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ming Dynasty’s Failure (`.../ming-dynastys-failure`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 108 | Chapter 01 - Aku Jagonya Menghambur-hamburkan Uang (`.../ming-dynastys-failure-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ming Dynasty’s Failure, URL=`.../ming-dynastys-failure` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../1720320895-2349-i357332.png <redacted query values: resize>` (image/png, 26016 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ming-dynastys-failure` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../1720320895-2349-i357332.png` (image/png, 23850 bytes, 160x213) |  |  |  |
| details author | PASS | 月关白勺文化 |  |  |  |
| details artist | PASS | 阅文漫画 |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, Historical, Martial arts, Shounen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Karya parodi lucu baru! T: Orang seperti apa Fang Ji Fan? Ayahnya, Jenderal: Kegagalan anak saya (menangis). Yang Mulia Kaisar: Saya sakit kepala setiap kali dia membuka mulutnya. Saat dia melangkah ke arahku, aku ingin lari. Yang Mulia Pangeran: Saya dikritik setiap hari karena dia. Fang Ji Fan: Saya di sini, teman-teman, apakah Anda merindukan saya? Jenderal, Kaisar, dan Pangeran: Ayo pergi dari sini!!<br><br>Alternative Names: The Prodigal Son of Ming Dynasty, Kẻ Ăn Hại Triều Minh, Ming Chao Bai Jia Zi, Ming Dynasty's Failure, Ming Dynasty’s Prodigal Son, Míng Cháo Bài Jiā Zi, 明朝败家子 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.jpg` (image/jpeg, 45126 bytes, 800x515) |  |  |  |
