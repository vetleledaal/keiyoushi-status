# Extension Validation Report

- Extension: tachiyomi-id.shiyurasub-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7106013231844823613
- Source name: ShiyuraSub
- Source language: id
- Selected manga input: popular offset 0: Detektif Conan (`.../detektif-conan.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Detektif Conan (`.../detektif-conan.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Detektif Conan (`.../detektif-conan.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Detektif Conan (`.../detektif-conan.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | Chapter 1055 (`.../detektif-conan-chapter-1055-indonesia.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Detektif Conan, URL=`.../detektif-conan.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 16/16 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 16/16 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../AVvXsEiCr5Vj_zFyYHBEwpQhhz_2igR3c3l9IUakMUZpFLZsnkgV6FdX3igb6oldn1Sni-j7KEy1S29eKqv1MT77U2CVLtKGX9VqL-X7xIk47b8AxoiVnRksCe7ZQwpqeYVQFlCsi4CcPGl5ph0lCfhGzqBK0K6i2jPdwIV91-C8X14zyoSAhbmfy-n3Rk_gmQ=w600` (image/jpeg, 55307 bytes, 350x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../detektif-conan.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../AVvXsEiCr5Vj_zFyYHBEwpQhhz_2igR3c3l9IUakMUZpFLZsnkgV6FdX3igb6oldn1Sni-j7KEy1S29eKqv1MT77U2CVLtKGX9VqL-X7xIk47b8AxoiVnRksCe7ZQwpqeYVQFlCsi4CcPGl5ph0lCfhGzqBK0K6i2jPdwIV91-C8X14zyoSAhbmfy-n3Rk_gmQ=w600` |  |  |  |
| details author | PASS | Aoyama Gosho |  |  |  |
| details artist | PASS | Aoyama Gosho |  |  |  |
| details genres | PASS | Adventure, Comedy, Mystery, Police, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shinichi Kudo, seorang detektif SMA berusia 17 tahun yang biasanya membantu polisi memecahkan kasus, diserang oleh 2 anggota sindikat misterius ketika mengawasi sebuah pemerasan. Ia kemudian diberi minum racun misterius yang baru selesai dikembangkan untuk membunuhnya. Namun, karena sebuah efek samping yang jarang terjadi yang tidak diketahui anggota sindikat tersebut, racun tersebut mengakibatkan tubuhnya mengecil seperti anak kecil berusia tujuh tahun setelah mereka meninggalkannya. Untuk menyembunyikan identitasnya dan untuk menginvestigasi keadaan sindikat tersebut, yang selanjutnya dikenal dengan nama Organisasi Berbaju Hitam atau Organisasi Hitam, dia menyamarkan namanya menjadi Conan Edogawa. Untuk mencari jejak sindikat tersebut, dia tinggal bersama dengan teman sejak kecilnya, Ran Mouri, yang ayahnya, Kogoro Mouri, merupakan seorang detektif swasta. Dia bersekolah di SD Teitan dan membentuk Grup Detektif Cilik dengan 3 teman sekelasnya, yaitu: Ayumi Yoshida, Mitsuhiko Tsuburaya, dan Genta Kojima. Meskipun tubuhnya mengecil, ia tetap memecahkan kasus. Biasanya, ia menyelesaikan kasus-kasus tersebut dengan meniru suara Kogoro Mouri dengan alat yang diciptakan oleh tetangganya, Profesor Agasa. Kogoro Mouri, seorang detektif yang agak bodoh, awalnya bingung pada kemampuan memecahkan kasusnya meningkat secara mendadak. Tetapi, kemudian ia tidak heran karena ia senang karena ketenarannya yang meningkat. Ran Mouri pernah beberapa kali mencurigai bahwa Conan adalah Shinichi, namun karena kecerdikan Conan, maka Ran pun percaya bahwa Conan bukanlah Shinichi. Download |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../AVvXsEjdBk9b2uxskJ4zoMTPtvvaf_tX8J8xQa720mN3LK3ki9RQF58d3eIfiecUji3Mbk0AivTMBSd-F9OTf-XX15OYnoVuqk12XMr8LkY99ZBk7uoIev0CBi-EPGk6MKbuTisWlVLGv5rD7L0DMT8XbtnvEd4XSESU3-FjE3ekvkYVoYQmoaN0hgRxfP1EfQ` (image/jpeg, 265627 bytes, 836x1200) |  |  |  |
