# Extension Validation Report

- Extension: tachiyomi-id.Luvyaa-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1316015886884953118
- Source name: Luvyaa
- Source language: id
- Selected manga input: latest offset 0: Filter-Goshi no Kanojo (`.../filter-goshi-no-kanojo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Flowers Are Bait (`.../flowers-are-bait`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | A Pervert Who Only Picks and Devours Other Perverts (`.../a-pervert-who-only-picks-and-devours-other-perverts`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Filter-Goshi no Kanojo (`.../filter-goshi-no-kanojo`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Holy Emperor’s Grandson is a Necromancer (`.../holy-emperors-grandson-is-a-necromancer`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 67 | A Flood of Stories (`.../a-flood-of-stories`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Filter-Goshi no Kanojo (`.../filter-goshi-no-kanojo`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | Chapter 1 (`.../filter-goshi-no-kanojo-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 30: title=Filter-Goshi no Kanojo, URL=`.../filter-goshi-no-kanojo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 139/139 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 139/139 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://v5.luvyaa.co/.../i505150.jpg` (image/jpeg, 25808 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../filter-goshi-no-kanojo` |  |  |  |
| details thumbnail URL | PASS | `https://v5.luvyaa.co/.../i505150.jpg` |  |  |  |
| details author | PASS | Author |  |  |  |
| details artist | PASS | Artist |  |  |  |
| details genres | PASS | Genre, Comedy, Ecchi, Harem, Mature, Romance, School life, Seinen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hakobe Narumi adalah seorang siswa SMA tanpa ekspresi yang dikenal sebagai Stoney. Hal yang paling menarik dari kehidupannya yang tak mencolok adalah mengikuti unggahan dari “Efa,” seorang pengguna media sosial yang populer karena sering mengunggah swafoto. Tapi ternyata “Efa” adalah teman sekelasnya yang rajin dan populer, Mitsuha Koto?! Komedi romantis swafoto remaja yang sedikit erotis antara seorang gadis swafoto berdinding baja dan seorang anak laki-laki berwajah datar pun dimulai!<br><br>Alternative Names: Cô Gái Bí Ẩn Qua Lớp Filter, Firutaa Goshi no Kanojo, Secret Girl Through the Filter, The Girl Past the Filters, Девушка через фильтр, เรื่องลับหลังเลนส์, フィルター越しのカノジョ, 隔着滤镜的女朋友 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://v4.luvyaa.co/.../manga <redacted query values: title, page, and order>` to `https://v5.luvyaa.co/.../manga <redacted query values: title, page, and order>` (1 redirects); popular_next: `https://v4.luvyaa.co/.../manga <redacted query values: title, page, and order>` to `https://v5.luvyaa.co/.../manga <redacted query values: title, page, and order>` (1 redirects); latest: `https://v4.luvyaa.co/.../manga <redacted query values: title, page, and order>` to `https://v5.luvyaa.co/.../manga <redacted query values: title, page, and order>` (1 redirects); latest_next: `https://v4.luvyaa.co/.../manga <redacted query values: title, page, and order>` to `https://v5.luvyaa.co/.../manga <redacted query values: title, page, and order>` (1 redirects); search: `https://v4.luvyaa.co/.../manga <redacted query values: title, page, author, yearx, status, type, and order>` to `https://v5.luvyaa.co` (2 redirects); details: `https://v4.luvyaa.co/.../filter-goshi-no-kanojo` to `https://v5.luvyaa.co/.../filter-goshi-no-kanojo` (1 redirects); chapters: `https://v4.luvyaa.co/.../filter-goshi-no-kanojo` to `https://v5.luvyaa.co/.../filter-goshi-no-kanojo` (1 redirects); pages: `https://v4.luvyaa.co/.../filter-goshi-no-kanojo-chapter-1` to `https://v5.luvyaa.co/.../filter-goshi-no-kanojo-chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://img1.cdn-nyaa.link/.../01.webp <redacted query values: v>` (image/webp (container: extended), 133142 bytes, 728x1035) |  |  |  |
