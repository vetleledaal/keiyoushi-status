# Extension Validation Report

- Extension: tachiyomi-id.manhwalistorg-v1.4.34
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
- Source ID: 1031213229391436059
- Source name: IsekaiKomik
- Source language: id
- Selected manga input: latest offset 0: MookHyang: Dark Lady (`.../mookhyang-dark-lady`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | The Crow’s Prince (`.../the-crows-prince`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Lord Baby Runs a Romance Fantasy With Cash (`.../lord-baby-runs-a-romance-fantasy-with-cash`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | MookHyang: Dark Lady (`.../mookhyang-dark-lady`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Bad Born Blood (`.../bad-born-blood`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | MookHyang: Dark Lady (`.../mookhyang-dark-lady`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | MookHyang: Dark Lady (`.../mookhyang-dark-lady`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 297 | Chapter 0 (`.../mookhyang-dark-lady-chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MookHyang: Dark Lady, URL=`.../mookhyang-dark-lady` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ch1.isekaikomik.site/.../Mookhyang-Dark-Lady-210x300.jpg` (image/jpeg, 24220 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mookhyang-dark-lady` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ch1.isekaikomik.site/.../Mookhyang-Dark-Lady.jpg` (image/jpeg, 153775 bytes, 512x732) |  |  |  |
| details author | PASS | Jul 4, 2019 to ? |  |  |  |
| details artist | PASS | Jeon Dong-jo |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Genderswap, Isekai, Magic, Martial arts, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seniman bela diri yang luar biasa dan hierarki yang bangga dari Sekte Iblis, Mookhyang, berakhir di dunia fantasi baru yang aneh setelah menjadi korban kutukan musuhnya, Sekte Darah. Tapi ketika kendali luar biasa Mookhyang atas qi, atau mana, diketahui, hanya masalah waktu sebelum dia dikutuk lagi… dan berubah menjadi seorang wanita muda?! Di dunia elf, penyihir, ksatria, dan naga ini, akankah penguasaan seni bela diri Tiongkok cukup bagi satu pria (atau wanita) untuk berjuang pulang ke rumah? Atau akankah pejuang yang rendah hati ini akhirnya mengakui kekalahannya? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 297 chapters |  |  |  |
| chapter dates | PASS | 297 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.isekaikomik.com/.../01.jpg` (image/jpeg, 110478 bytes, 720x1024) |  |  |  |
