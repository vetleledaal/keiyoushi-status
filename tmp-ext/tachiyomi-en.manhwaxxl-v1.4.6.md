# Extension Validation Report

- Extension: tachiyomi-en.manhwaxxl-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1823408414151467671
- Source name: Manhwa XXL
- Source language: en
- Selected manga input: latest offset 0: Magnetic Pull (`.../magnetic-pull.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | A Very Privative Revenge (`.../a-very-privative-revenge.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Magnetic Pull (`.../magnetic-pull.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Magnetic Pull (`.../magnetic-pull.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Magnetic Pull (`.../magnetic-pull.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Magnetic Pull (`.../magnetic-pull.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 66 | Chapter 0 (`.../chapter-0.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magnetic Pull, URL=`.../magnetic-pull.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Taming A Female Bully, URL=`.../taming-a-female-bully.html` at page 1 offset 20 and page 2 offset 15, title=Saimin Ochi Nante Mousou Desu – Decensored, URL=`.../saimin-ochi-nante-mousou-desu-decensored.html` at page 1 offset 21 and page 2 offset 16, title=Hijiri Futanari Jogakuin No Imposter, URL=`.../hijiri-futanari-jogakuin-no-imposter.html` at page 1 offset 22 and page 2 offset 17, title=A Single Mom Was Working At A Box-style Brothel When A Dad She Knows From The Preschool Came By, URL=`.../a-single-mom-was-working-at-a-box-style-brothel-when-a-dad-she-knows-from-the-preschool-came-by.html` at page 1 offset 23 and page 2 offset 18 |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.hentaitnt.net/.../magnetic-pull.webp` (image/webp (encoding: lossy), 14204 bytes, 249x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magnetic-pull.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Wettoonie |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Mature |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A flock of women is getting pulled into this new divorcé’s life. Is there a magnetic pull that’s at work? Or is Joey’s ex-wife jinxing him? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 66 chapters |  |  |  |
| chapter dates | LINT | All 66 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=66 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn3.tymanga.com/.../1-471.jpg` (image/jpeg, 61348 bytes, 634x440) |  |  |  |
